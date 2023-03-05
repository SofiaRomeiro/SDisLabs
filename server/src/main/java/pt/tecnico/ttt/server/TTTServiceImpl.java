package pt.tecnico.ttt.server;

import io.grpc.stub.StreamObserver;
import pt.tecnico.ttt.*;
import java.lang.*;

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

	@Override
	public void playResult(PlayResultRequest request, StreamObserver<PlayResultResponse> responseObserver) {

		System.out.println("[LOG] playResult request: " + request);

		int player = request.getPlayer();
		int row = request.getRow();
		int column = request.getColumn();

		System.out.println("[LOG] Player " + player);
		System.out.println("[LOG] Row " + row + " and column " + column);

		PlayResultResponse response = PlayResultResponse
				.newBuilder()
				.setResult(ttt.play(row, column, player))
				.build();

		System.out.println("[LOG] playResult response: " + response);

		responseObserver.onNext(response);

		responseObserver.onCompleted();

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
