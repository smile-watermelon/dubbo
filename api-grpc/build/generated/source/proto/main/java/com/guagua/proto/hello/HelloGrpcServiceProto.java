// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello_service.proto

package com.guagua.proto.hello;

public final class HelloGrpcServiceProto {
  private HelloGrpcServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hello_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hello_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hello_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hello_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023hello_service.proto\022\005hello\"j\n\014HelloReq" +
      "uest\022\n\n\002id\030\001 \001(\r\022\014\n\004name\030\002 \001(\t\022\013\n\003age\030\003 " +
      "\001(\r\022\020\n\010password\030\004 \001(\t\022\017\n\007address\030\005 \003(\t\022\020" +
      "\n\004flag\030\006 \001(\010B\002\030\001\"\035\n\rHelloResponse\022\014\n\004uui" +
      "d\030\001 \001(\t2D\n\020HelloGrpcService\0220\n\003Say\022\023.hel" +
      "lo.HelloRequest\032\024.hello.HelloResponseB1\n" +
      "\026com.guagua.proto.helloB\025HelloGrpcServic" +
      "eProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_hello_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hello_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hello_HelloRequest_descriptor,
        new java.lang.String[] { "Id", "Name", "Age", "Password", "Address", "Flag", });
    internal_static_hello_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hello_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hello_HelloResponse_descriptor,
        new java.lang.String[] { "Uuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
