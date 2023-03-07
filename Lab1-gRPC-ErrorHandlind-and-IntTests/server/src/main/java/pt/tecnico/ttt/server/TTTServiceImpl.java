package pt.tecnico.ttt.server;

import io.grpc.stub.StreamObserver;
import pt.tecnico.ttt.*;
import java.lang.*;
import static io.grpc.Status.INVALID_ARGUMENT;

public class TTTServiceImpl extends TTTGrpc.TTTImplBase {

	/** Game implementation. */
	private TTTGame ttt = new TTTGame();

	@Override
	public void currentBoard(CurrentBoardRequest request, StreamObserver<CurrentBoardResponse> responseObserver) {
		// StreamObserver is used to represent the gRPC stream between the server and
		// client in order to send the appropriate responses (or errors, if any occur).

		CurrentBoardResponse response = CurrentBoardResponse.newBuilder().setBoard(ttt.toString()).build();

		// Send a single response through the stream.
		responseObserver.onNext(response);
		// Notify the client that the operation has been completed.
		responseObserver.onCompleted();
	}


	public void changePlayer(ChangePlayerRequest request, StreamObserver<ChangePlayerResponse> responseObserver) {

		int nextPlayer = ttt.changePlayer();

		ChangePlayerResponse result = ChangePlayerResponse
				.newBuilder()
				.setNextPlayer(nextPlayer)
				.build();

		responseObserver.onNext(result);

		responseObserver.onCompleted();

	}

	@Override
	public void playResult(PlayResultRequest request, StreamObserver<PlayResultResponse> responseObserver) {

		System.out.println("[LOG] playResult request: " + request);

		int player = request.getPlayer();
		int row = request.getRow();
		int column = request.getColumn();

		System.out.println("[LOG] Player " + player);
		System.out.println("[LOG] Row " + row + " and column " + column);

		PlayResult result = ttt.play(row, column, player);

		if (result == PlayResult.OUT_OF_BOUNDS) {
			responseObserver
			.onError(INVALID_ARGUMENT
			.withDescription("Input needs to be a valid position")
			.asRuntimeException()
			);
		}
		else {
			PlayResultResponse response = PlayResultResponse
				.newBuilder()
				.setResult(result)
				.build();
				
			responseObserver.onNext(response);

			responseObserver.onCompleted();

			System.out.println("[LOG] playResult response: " + response);
		}
	}

	@Override
	public void checkWinner(CheckWinnerRequest request, StreamObserver<CheckWinnerResponse> responseObserver) {

		System.out.println("[LOG] checkWinner request: " + request);

		CheckWinnerResponse response = CheckWinnerResponse
				.newBuilder()
				.setResult(ttt.checkWinner())
				.build();

		System.out.println("[LOG] checkWinner response: " + response);

		responseObserver.onNext(response);

		responseObserver.onCompleted();

	}
}
