package pt.tecnico.ttt;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: tttgame.proto")
public final class TTTGrpc {

  private TTTGrpc() {}

  public static final String SERVICE_NAME = "pt.tecnico.ttt.TTT";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pt.tecnico.ttt.CurrentBoardRequest,
      pt.tecnico.ttt.CurrentBoardResponse> getCurrentBoardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentBoard",
      requestType = pt.tecnico.ttt.CurrentBoardRequest.class,
      responseType = pt.tecnico.ttt.CurrentBoardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.tecnico.ttt.CurrentBoardRequest,
      pt.tecnico.ttt.CurrentBoardResponse> getCurrentBoardMethod() {
    io.grpc.MethodDescriptor<pt.tecnico.ttt.CurrentBoardRequest, pt.tecnico.ttt.CurrentBoardResponse> getCurrentBoardMethod;
    if ((getCurrentBoardMethod = TTTGrpc.getCurrentBoardMethod) == null) {
      synchronized (TTTGrpc.class) {
        if ((getCurrentBoardMethod = TTTGrpc.getCurrentBoardMethod) == null) {
          TTTGrpc.getCurrentBoardMethod = getCurrentBoardMethod =
              io.grpc.MethodDescriptor.<pt.tecnico.ttt.CurrentBoardRequest, pt.tecnico.ttt.CurrentBoardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentBoard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.tecnico.ttt.CurrentBoardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.tecnico.ttt.CurrentBoardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TTTMethodDescriptorSupplier("CurrentBoard"))
              .build();
        }
      }
    }
    return getCurrentBoardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.tecnico.ttt.PlayResultRequest,
      pt.tecnico.ttt.PlayResultResponse> getPlayResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayResult",
      requestType = pt.tecnico.ttt.PlayResultRequest.class,
      responseType = pt.tecnico.ttt.PlayResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.tecnico.ttt.PlayResultRequest,
      pt.tecnico.ttt.PlayResultResponse> getPlayResultMethod() {
    io.grpc.MethodDescriptor<pt.tecnico.ttt.PlayResultRequest, pt.tecnico.ttt.PlayResultResponse> getPlayResultMethod;
    if ((getPlayResultMethod = TTTGrpc.getPlayResultMethod) == null) {
      synchronized (TTTGrpc.class) {
        if ((getPlayResultMethod = TTTGrpc.getPlayResultMethod) == null) {
          TTTGrpc.getPlayResultMethod = getPlayResultMethod =
              io.grpc.MethodDescriptor.<pt.tecnico.ttt.PlayResultRequest, pt.tecnico.ttt.PlayResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.tecnico.ttt.PlayResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.tecnico.ttt.PlayResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TTTMethodDescriptorSupplier("PlayResult"))
              .build();
        }
      }
    }
    return getPlayResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.tecnico.ttt.CheckWinnerRequest,
      pt.tecnico.ttt.CheckWinnerResponse> getCheckWinnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckWinner",
      requestType = pt.tecnico.ttt.CheckWinnerRequest.class,
      responseType = pt.tecnico.ttt.CheckWinnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.tecnico.ttt.CheckWinnerRequest,
      pt.tecnico.ttt.CheckWinnerResponse> getCheckWinnerMethod() {
    io.grpc.MethodDescriptor<pt.tecnico.ttt.CheckWinnerRequest, pt.tecnico.ttt.CheckWinnerResponse> getCheckWinnerMethod;
    if ((getCheckWinnerMethod = TTTGrpc.getCheckWinnerMethod) == null) {
      synchronized (TTTGrpc.class) {
        if ((getCheckWinnerMethod = TTTGrpc.getCheckWinnerMethod) == null) {
          TTTGrpc.getCheckWinnerMethod = getCheckWinnerMethod =
              io.grpc.MethodDescriptor.<pt.tecnico.ttt.CheckWinnerRequest, pt.tecnico.ttt.CheckWinnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckWinner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.tecnico.ttt.CheckWinnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.tecnico.ttt.CheckWinnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TTTMethodDescriptorSupplier("CheckWinner"))
              .build();
        }
      }
    }
    return getCheckWinnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.tecnico.ttt.ChangePlayerRequest,
      pt.tecnico.ttt.ChangePlayerResponse> getChangePlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangePlayer",
      requestType = pt.tecnico.ttt.ChangePlayerRequest.class,
      responseType = pt.tecnico.ttt.ChangePlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.tecnico.ttt.ChangePlayerRequest,
      pt.tecnico.ttt.ChangePlayerResponse> getChangePlayerMethod() {
    io.grpc.MethodDescriptor<pt.tecnico.ttt.ChangePlayerRequest, pt.tecnico.ttt.ChangePlayerResponse> getChangePlayerMethod;
    if ((getChangePlayerMethod = TTTGrpc.getChangePlayerMethod) == null) {
      synchronized (TTTGrpc.class) {
        if ((getChangePlayerMethod = TTTGrpc.getChangePlayerMethod) == null) {
          TTTGrpc.getChangePlayerMethod = getChangePlayerMethod =
              io.grpc.MethodDescriptor.<pt.tecnico.ttt.ChangePlayerRequest, pt.tecnico.ttt.ChangePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangePlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.tecnico.ttt.ChangePlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.tecnico.ttt.ChangePlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TTTMethodDescriptorSupplier("ChangePlayer"))
              .build();
        }
      }
    }
    return getChangePlayerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TTTStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TTTStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TTTStub>() {
        @java.lang.Override
        public TTTStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TTTStub(channel, callOptions);
        }
      };
    return TTTStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TTTBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TTTBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TTTBlockingStub>() {
        @java.lang.Override
        public TTTBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TTTBlockingStub(channel, callOptions);
        }
      };
    return TTTBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TTTFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TTTFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TTTFutureStub>() {
        @java.lang.Override
        public TTTFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TTTFutureStub(channel, callOptions);
        }
      };
    return TTTFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TTTImplBase implements io.grpc.BindableService {

    /**
     */
    public void currentBoard(pt.tecnico.ttt.CurrentBoardRequest request,
        io.grpc.stub.StreamObserver<pt.tecnico.ttt.CurrentBoardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentBoardMethod(), responseObserver);
    }

    /**
     */
    public void playResult(pt.tecnico.ttt.PlayResultRequest request,
        io.grpc.stub.StreamObserver<pt.tecnico.ttt.PlayResultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayResultMethod(), responseObserver);
    }

    /**
     */
    public void checkWinner(pt.tecnico.ttt.CheckWinnerRequest request,
        io.grpc.stub.StreamObserver<pt.tecnico.ttt.CheckWinnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckWinnerMethod(), responseObserver);
    }

    /**
     */
    public void changePlayer(pt.tecnico.ttt.ChangePlayerRequest request,
        io.grpc.stub.StreamObserver<pt.tecnico.ttt.ChangePlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangePlayerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCurrentBoardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.tecnico.ttt.CurrentBoardRequest,
                pt.tecnico.ttt.CurrentBoardResponse>(
                  this, METHODID_CURRENT_BOARD)))
          .addMethod(
            getPlayResultMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.tecnico.ttt.PlayResultRequest,
                pt.tecnico.ttt.PlayResultResponse>(
                  this, METHODID_PLAY_RESULT)))
          .addMethod(
            getCheckWinnerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.tecnico.ttt.CheckWinnerRequest,
                pt.tecnico.ttt.CheckWinnerResponse>(
                  this, METHODID_CHECK_WINNER)))
          .addMethod(
            getChangePlayerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.tecnico.ttt.ChangePlayerRequest,
                pt.tecnico.ttt.ChangePlayerResponse>(
                  this, METHODID_CHANGE_PLAYER)))
          .build();
    }
  }

  /**
   */
  public static final class TTTStub extends io.grpc.stub.AbstractAsyncStub<TTTStub> {
    private TTTStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TTTStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TTTStub(channel, callOptions);
    }

    /**
     */
    public void currentBoard(pt.tecnico.ttt.CurrentBoardRequest request,
        io.grpc.stub.StreamObserver<pt.tecnico.ttt.CurrentBoardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentBoardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void playResult(pt.tecnico.ttt.PlayResultRequest request,
        io.grpc.stub.StreamObserver<pt.tecnico.ttt.PlayResultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkWinner(pt.tecnico.ttt.CheckWinnerRequest request,
        io.grpc.stub.StreamObserver<pt.tecnico.ttt.CheckWinnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckWinnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changePlayer(pt.tecnico.ttt.ChangePlayerRequest request,
        io.grpc.stub.StreamObserver<pt.tecnico.ttt.ChangePlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangePlayerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TTTBlockingStub extends io.grpc.stub.AbstractBlockingStub<TTTBlockingStub> {
    private TTTBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TTTBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TTTBlockingStub(channel, callOptions);
    }

    /**
     */
    public pt.tecnico.ttt.CurrentBoardResponse currentBoard(pt.tecnico.ttt.CurrentBoardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentBoardMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.tecnico.ttt.PlayResultResponse playResult(pt.tecnico.ttt.PlayResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayResultMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.tecnico.ttt.CheckWinnerResponse checkWinner(pt.tecnico.ttt.CheckWinnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckWinnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.tecnico.ttt.ChangePlayerResponse changePlayer(pt.tecnico.ttt.ChangePlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangePlayerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TTTFutureStub extends io.grpc.stub.AbstractFutureStub<TTTFutureStub> {
    private TTTFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TTTFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TTTFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.tecnico.ttt.CurrentBoardResponse> currentBoard(
        pt.tecnico.ttt.CurrentBoardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentBoardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.tecnico.ttt.PlayResultResponse> playResult(
        pt.tecnico.ttt.PlayResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayResultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.tecnico.ttt.CheckWinnerResponse> checkWinner(
        pt.tecnico.ttt.CheckWinnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckWinnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.tecnico.ttt.ChangePlayerResponse> changePlayer(
        pt.tecnico.ttt.ChangePlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangePlayerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CURRENT_BOARD = 0;
  private static final int METHODID_PLAY_RESULT = 1;
  private static final int METHODID_CHECK_WINNER = 2;
  private static final int METHODID_CHANGE_PLAYER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TTTImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TTTImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CURRENT_BOARD:
          serviceImpl.currentBoard((pt.tecnico.ttt.CurrentBoardRequest) request,
              (io.grpc.stub.StreamObserver<pt.tecnico.ttt.CurrentBoardResponse>) responseObserver);
          break;
        case METHODID_PLAY_RESULT:
          serviceImpl.playResult((pt.tecnico.ttt.PlayResultRequest) request,
              (io.grpc.stub.StreamObserver<pt.tecnico.ttt.PlayResultResponse>) responseObserver);
          break;
        case METHODID_CHECK_WINNER:
          serviceImpl.checkWinner((pt.tecnico.ttt.CheckWinnerRequest) request,
              (io.grpc.stub.StreamObserver<pt.tecnico.ttt.CheckWinnerResponse>) responseObserver);
          break;
        case METHODID_CHANGE_PLAYER:
          serviceImpl.changePlayer((pt.tecnico.ttt.ChangePlayerRequest) request,
              (io.grpc.stub.StreamObserver<pt.tecnico.ttt.ChangePlayerResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TTTBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TTTBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pt.tecnico.ttt.Tttgame.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TTT");
    }
  }

  private static final class TTTFileDescriptorSupplier
      extends TTTBaseDescriptorSupplier {
    TTTFileDescriptorSupplier() {}
  }

  private static final class TTTMethodDescriptorSupplier
      extends TTTBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TTTMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TTTGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TTTFileDescriptorSupplier())
              .addMethod(getCurrentBoardMethod())
              .addMethod(getPlayResultMethod())
              .addMethod(getCheckWinnerMethod())
              .addMethod(getChangePlayerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
