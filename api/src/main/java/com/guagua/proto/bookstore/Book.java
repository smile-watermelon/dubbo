// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: book_message.proto

package com.guagua.proto.bookstore;

/**
 * Protobuf type {@code bookstore.Book}
 */
public  final class Book extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookstore.Book)
    BookOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Book.newBuilder() to construct.
  private Book(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Book() {
    name_ = "";
    publisher_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Book(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readUInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 25: {

            sellingPrice_ = input.readDouble();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            publisher_ = s;
            break;
          }
          case 42: {
            com.guagua.proto.bookstore.AuthorMessage.Author.Builder subBuilder = null;
            if (author_ != null) {
              subBuilder = author_.toBuilder();
            }
            author_ = input.readMessage(com.guagua.proto.bookstore.AuthorMessage.Author.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(author_);
              author_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.guagua.proto.bookstore.BookMessage.internal_static_bookstore_Book_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.guagua.proto.bookstore.BookMessage.internal_static_bookstore_Book_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.guagua.proto.bookstore.Book.class, com.guagua.proto.bookstore.Book.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>uint32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * 书名
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 书名
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SELLING_PRICE_FIELD_NUMBER = 3;
  private double sellingPrice_;
  /**
   * <pre>
   * 售价
   * </pre>
   *
   * <code>double selling_price = 3;</code>
   */
  public double getSellingPrice() {
    return sellingPrice_;
  }

  public static final int PUBLISHER_FIELD_NUMBER = 4;
  private volatile java.lang.Object publisher_;
  /**
   * <pre>
   * 出版公司
   * </pre>
   *
   * <code>string publisher = 4;</code>
   */
  public java.lang.String getPublisher() {
    java.lang.Object ref = publisher_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publisher_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 出版公司
   * </pre>
   *
   * <code>string publisher = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPublisherBytes() {
    java.lang.Object ref = publisher_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      publisher_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTHOR_FIELD_NUMBER = 5;
  private com.guagua.proto.bookstore.AuthorMessage.Author author_;
  /**
   * <pre>
   * 作者
   * </pre>
   *
   * <code>.bookstore.Author author = 5;</code>
   */
  public boolean hasAuthor() {
    return author_ != null;
  }
  /**
   * <pre>
   * 作者
   * </pre>
   *
   * <code>.bookstore.Author author = 5;</code>
   */
  public com.guagua.proto.bookstore.AuthorMessage.Author getAuthor() {
    return author_ == null ? com.guagua.proto.bookstore.AuthorMessage.Author.getDefaultInstance() : author_;
  }
  /**
   * <pre>
   * 作者
   * </pre>
   *
   * <code>.bookstore.Author author = 5;</code>
   */
  public com.guagua.proto.bookstore.AuthorMessage.AuthorOrBuilder getAuthorOrBuilder() {
    return getAuthor();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeUInt32(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (sellingPrice_ != 0D) {
      output.writeDouble(3, sellingPrice_);
    }
    if (!getPublisherBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, publisher_);
    }
    if (author_ != null) {
      output.writeMessage(5, getAuthor());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (sellingPrice_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, sellingPrice_);
    }
    if (!getPublisherBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, publisher_);
    }
    if (author_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getAuthor());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.guagua.proto.bookstore.Book)) {
      return super.equals(obj);
    }
    com.guagua.proto.bookstore.Book other = (com.guagua.proto.bookstore.Book) obj;

    if (getId()
        != other.getId()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (java.lang.Double.doubleToLongBits(getSellingPrice())
        != java.lang.Double.doubleToLongBits(
            other.getSellingPrice())) return false;
    if (!getPublisher()
        .equals(other.getPublisher())) return false;
    if (hasAuthor() != other.hasAuthor()) return false;
    if (hasAuthor()) {
      if (!getAuthor()
          .equals(other.getAuthor())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SELLING_PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSellingPrice()));
    hash = (37 * hash) + PUBLISHER_FIELD_NUMBER;
    hash = (53 * hash) + getPublisher().hashCode();
    if (hasAuthor()) {
      hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
      hash = (53 * hash) + getAuthor().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.guagua.proto.bookstore.Book parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.guagua.proto.bookstore.Book parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.guagua.proto.bookstore.Book parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.guagua.proto.bookstore.Book parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.guagua.proto.bookstore.Book parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.guagua.proto.bookstore.Book parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.guagua.proto.bookstore.Book parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.guagua.proto.bookstore.Book parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.guagua.proto.bookstore.Book parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.guagua.proto.bookstore.Book parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.guagua.proto.bookstore.Book parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.guagua.proto.bookstore.Book parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.guagua.proto.bookstore.Book prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code bookstore.Book}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookstore.Book)
      com.guagua.proto.bookstore.BookOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.guagua.proto.bookstore.BookMessage.internal_static_bookstore_Book_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.guagua.proto.bookstore.BookMessage.internal_static_bookstore_Book_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.guagua.proto.bookstore.Book.class, com.guagua.proto.bookstore.Book.Builder.class);
    }

    // Construct using com.guagua.proto.bookstore.Book.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      name_ = "";

      sellingPrice_ = 0D;

      publisher_ = "";

      if (authorBuilder_ == null) {
        author_ = null;
      } else {
        author_ = null;
        authorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.guagua.proto.bookstore.BookMessage.internal_static_bookstore_Book_descriptor;
    }

    @java.lang.Override
    public com.guagua.proto.bookstore.Book getDefaultInstanceForType() {
      return com.guagua.proto.bookstore.Book.getDefaultInstance();
    }

    @java.lang.Override
    public com.guagua.proto.bookstore.Book build() {
      com.guagua.proto.bookstore.Book result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.guagua.proto.bookstore.Book buildPartial() {
      com.guagua.proto.bookstore.Book result = new com.guagua.proto.bookstore.Book(this);
      result.id_ = id_;
      result.name_ = name_;
      result.sellingPrice_ = sellingPrice_;
      result.publisher_ = publisher_;
      if (authorBuilder_ == null) {
        result.author_ = author_;
      } else {
        result.author_ = authorBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.guagua.proto.bookstore.Book) {
        return mergeFrom((com.guagua.proto.bookstore.Book)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.guagua.proto.bookstore.Book other) {
      if (other == com.guagua.proto.bookstore.Book.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getSellingPrice() != 0D) {
        setSellingPrice(other.getSellingPrice());
      }
      if (!other.getPublisher().isEmpty()) {
        publisher_ = other.publisher_;
        onChanged();
      }
      if (other.hasAuthor()) {
        mergeAuthor(other.getAuthor());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.guagua.proto.bookstore.Book parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.guagua.proto.bookstore.Book) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>uint32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>uint32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * 书名
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 书名
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 书名
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 书名
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 书名
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private double sellingPrice_ ;
    /**
     * <pre>
     * 售价
     * </pre>
     *
     * <code>double selling_price = 3;</code>
     */
    public double getSellingPrice() {
      return sellingPrice_;
    }
    /**
     * <pre>
     * 售价
     * </pre>
     *
     * <code>double selling_price = 3;</code>
     */
    public Builder setSellingPrice(double value) {
      
      sellingPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 售价
     * </pre>
     *
     * <code>double selling_price = 3;</code>
     */
    public Builder clearSellingPrice() {
      
      sellingPrice_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object publisher_ = "";
    /**
     * <pre>
     * 出版公司
     * </pre>
     *
     * <code>string publisher = 4;</code>
     */
    public java.lang.String getPublisher() {
      java.lang.Object ref = publisher_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publisher_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 出版公司
     * </pre>
     *
     * <code>string publisher = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPublisherBytes() {
      java.lang.Object ref = publisher_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        publisher_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 出版公司
     * </pre>
     *
     * <code>string publisher = 4;</code>
     */
    public Builder setPublisher(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      publisher_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 出版公司
     * </pre>
     *
     * <code>string publisher = 4;</code>
     */
    public Builder clearPublisher() {
      
      publisher_ = getDefaultInstance().getPublisher();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 出版公司
     * </pre>
     *
     * <code>string publisher = 4;</code>
     */
    public Builder setPublisherBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      publisher_ = value;
      onChanged();
      return this;
    }

    private com.guagua.proto.bookstore.AuthorMessage.Author author_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.guagua.proto.bookstore.AuthorMessage.Author, com.guagua.proto.bookstore.AuthorMessage.Author.Builder, com.guagua.proto.bookstore.AuthorMessage.AuthorOrBuilder> authorBuilder_;
    /**
     * <pre>
     * 作者
     * </pre>
     *
     * <code>.bookstore.Author author = 5;</code>
     */
    public boolean hasAuthor() {
      return authorBuilder_ != null || author_ != null;
    }
    /**
     * <pre>
     * 作者
     * </pre>
     *
     * <code>.bookstore.Author author = 5;</code>
     */
    public com.guagua.proto.bookstore.AuthorMessage.Author getAuthor() {
      if (authorBuilder_ == null) {
        return author_ == null ? com.guagua.proto.bookstore.AuthorMessage.Author.getDefaultInstance() : author_;
      } else {
        return authorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 作者
     * </pre>
     *
     * <code>.bookstore.Author author = 5;</code>
     */
    public Builder setAuthor(com.guagua.proto.bookstore.AuthorMessage.Author value) {
      if (authorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        author_ = value;
        onChanged();
      } else {
        authorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 作者
     * </pre>
     *
     * <code>.bookstore.Author author = 5;</code>
     */
    public Builder setAuthor(
        com.guagua.proto.bookstore.AuthorMessage.Author.Builder builderForValue) {
      if (authorBuilder_ == null) {
        author_ = builderForValue.build();
        onChanged();
      } else {
        authorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 作者
     * </pre>
     *
     * <code>.bookstore.Author author = 5;</code>
     */
    public Builder mergeAuthor(com.guagua.proto.bookstore.AuthorMessage.Author value) {
      if (authorBuilder_ == null) {
        if (author_ != null) {
          author_ =
            com.guagua.proto.bookstore.AuthorMessage.Author.newBuilder(author_).mergeFrom(value).buildPartial();
        } else {
          author_ = value;
        }
        onChanged();
      } else {
        authorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 作者
     * </pre>
     *
     * <code>.bookstore.Author author = 5;</code>
     */
    public Builder clearAuthor() {
      if (authorBuilder_ == null) {
        author_ = null;
        onChanged();
      } else {
        author_ = null;
        authorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 作者
     * </pre>
     *
     * <code>.bookstore.Author author = 5;</code>
     */
    public com.guagua.proto.bookstore.AuthorMessage.Author.Builder getAuthorBuilder() {
      
      onChanged();
      return getAuthorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 作者
     * </pre>
     *
     * <code>.bookstore.Author author = 5;</code>
     */
    public com.guagua.proto.bookstore.AuthorMessage.AuthorOrBuilder getAuthorOrBuilder() {
      if (authorBuilder_ != null) {
        return authorBuilder_.getMessageOrBuilder();
      } else {
        return author_ == null ?
            com.guagua.proto.bookstore.AuthorMessage.Author.getDefaultInstance() : author_;
      }
    }
    /**
     * <pre>
     * 作者
     * </pre>
     *
     * <code>.bookstore.Author author = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.guagua.proto.bookstore.AuthorMessage.Author, com.guagua.proto.bookstore.AuthorMessage.Author.Builder, com.guagua.proto.bookstore.AuthorMessage.AuthorOrBuilder> 
        getAuthorFieldBuilder() {
      if (authorBuilder_ == null) {
        authorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.guagua.proto.bookstore.AuthorMessage.Author, com.guagua.proto.bookstore.AuthorMessage.Author.Builder, com.guagua.proto.bookstore.AuthorMessage.AuthorOrBuilder>(
                getAuthor(),
                getParentForChildren(),
                isClean());
        author_ = null;
      }
      return authorBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bookstore.Book)
  }

  // @@protoc_insertion_point(class_scope:bookstore.Book)
  private static final com.guagua.proto.bookstore.Book DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.guagua.proto.bookstore.Book();
  }

  public static com.guagua.proto.bookstore.Book getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Book>
      PARSER = new com.google.protobuf.AbstractParser<Book>() {
    @java.lang.Override
    public Book parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Book(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Book> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Book> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.guagua.proto.bookstore.Book getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

