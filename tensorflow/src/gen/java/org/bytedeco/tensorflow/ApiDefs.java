// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ApiDefs extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ApiDefs(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ApiDefs(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ApiDefs position(long position) {
        return (ApiDefs)super.position(position);
    }

  public ApiDefs() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ApiDefs(@Const @ByRef ApiDefs from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ApiDefs from);

  public native @ByRef @Name("operator =") ApiDefs put(@Const @ByRef ApiDefs from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef ApiDefs default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ApiDefs internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(ApiDefs other);
  public native void Swap(ApiDefs other);
  

  // implements Message ----------------------------------------------

  public native ApiDefs New();

  public native ApiDefs New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef ApiDefs from);
  public native void MergeFrom(@Const @ByRef ApiDefs from);
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

  // repeated .tensorflow.ApiDef op = 1;
  public native int op_size();
  public native void clear_op();
  @MemberGetter public static native int kOpFieldNumber();
  public static final int kOpFieldNumber = kOpFieldNumber();
  public native ApiDef mutable_op(int index);
  public native @Const @ByRef ApiDef op(int index);
  public native ApiDef add_op();
}
