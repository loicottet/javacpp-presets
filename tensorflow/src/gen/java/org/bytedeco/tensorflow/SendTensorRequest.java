// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow::eager") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SendTensorRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SendTensorRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SendTensorRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SendTensorRequest position(long position) {
        return (SendTensorRequest)super.position(position);
    }

  public SendTensorRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SendTensorRequest(@Const @ByRef SendTensorRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SendTensorRequest from);

  public native @ByRef @Name("operator =") SendTensorRequest put(@Const @ByRef SendTensorRequest from);
//   #if LANG_CXX11
//   #endif
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef SendTensorRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SendTensorRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(SendTensorRequest other);
  

  // implements Message ----------------------------------------------

  public native SendTensorRequest New();

  public native SendTensorRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SendTensorRequest from);
  public native void MergeFrom(@Const @ByRef SendTensorRequest from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated .tensorflow.TensorProto tensors = 3;
  public native int tensors_size();
  public native void clear_tensors();
  @MemberGetter public static native int kTensorsFieldNumber();
  public static final int kTensorsFieldNumber = kTensorsFieldNumber();
  public native TensorProto mutable_tensors(int index);
  public native @Const @ByRef TensorProto tensors(int index);
  public native TensorProto add_tensors();

  // string device_name = 4;
  public native void clear_device_name();
  @MemberGetter public static native int kDeviceNameFieldNumber();
  public static final int kDeviceNameFieldNumber = kDeviceNameFieldNumber();
  public native @StdString BytePointer device_name();
  public native void set_device_name(@StdString BytePointer value);
  public native void set_device_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_device_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_device_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_device_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_device_name();
  public native void set_allocated_device_name(@StdString @Cast({"char*", "std::string*"}) BytePointer device_name);

  // fixed64 context_id = 1;
  public native void clear_context_id();
  @MemberGetter public static native int kContextIdFieldNumber();
  public static final int kContextIdFieldNumber = kContextIdFieldNumber();
  public native @Cast("google::protobuf::uint64") long context_id();
  public native void set_context_id(@Cast("google::protobuf::uint64") long value);

  // int64 op_id = 2;
  public native void clear_op_id();
  @MemberGetter public static native int kOpIdFieldNumber();
  public static final int kOpIdFieldNumber = kOpIdFieldNumber();
  public native @Cast("google::protobuf::int64") long op_id();
  public native void set_op_id(@Cast("google::protobuf::int64") long value);
}
