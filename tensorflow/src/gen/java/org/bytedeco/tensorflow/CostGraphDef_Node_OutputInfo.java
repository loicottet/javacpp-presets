// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CostGraphDef_Node_OutputInfo extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CostGraphDef_Node_OutputInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CostGraphDef_Node_OutputInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CostGraphDef_Node_OutputInfo position(long position) {
        return (CostGraphDef_Node_OutputInfo)super.position(position);
    }

  public CostGraphDef_Node_OutputInfo() { super((Pointer)null); allocate(); }
  private native void allocate();

  public CostGraphDef_Node_OutputInfo(@Const @ByRef CostGraphDef_Node_OutputInfo from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef CostGraphDef_Node_OutputInfo from);

  public native @ByRef @Name("operator =") CostGraphDef_Node_OutputInfo put(@Const @ByRef CostGraphDef_Node_OutputInfo from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef CostGraphDef_Node_OutputInfo default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const CostGraphDef_Node_OutputInfo internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(CostGraphDef_Node_OutputInfo other);
  public native void Swap(CostGraphDef_Node_OutputInfo other);
  

  // implements Message ----------------------------------------------

  public native CostGraphDef_Node_OutputInfo New();

  public native CostGraphDef_Node_OutputInfo New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef CostGraphDef_Node_OutputInfo from);
  public native void MergeFrom(@Const @ByRef CostGraphDef_Node_OutputInfo from);
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

  // .tensorflow.TensorShapeProto shape = 3;
  public native @Cast("bool") boolean has_shape();
  public native void clear_shape();
  @MemberGetter public static native int kShapeFieldNumber();
  public static final int kShapeFieldNumber = kShapeFieldNumber();
  public native @Const @ByRef TensorShapeProto shape();
  public native TensorShapeProto release_shape();
  public native TensorShapeProto mutable_shape();
  public native void set_allocated_shape(TensorShapeProto shape);
  public native void unsafe_arena_set_allocated_shape(
        TensorShapeProto shape);
  public native TensorShapeProto unsafe_arena_release_shape();

  // int64 size = 1;
  public native void clear_size();
  @MemberGetter public static native int kSizeFieldNumber();
  public static final int kSizeFieldNumber = kSizeFieldNumber();
  public native @Cast("google::protobuf::int64") long size();
  public native void set_size(@Cast("google::protobuf::int64") long value);

  // int64 alias_input_port = 2;
  public native void clear_alias_input_port();
  @MemberGetter public static native int kAliasInputPortFieldNumber();
  public static final int kAliasInputPortFieldNumber = kAliasInputPortFieldNumber();
  public native @Cast("google::protobuf::int64") long alias_input_port();
  public native void set_alias_input_port(@Cast("google::protobuf::int64") long value);

  // .tensorflow.DataType dtype = 4;
  public native void clear_dtype();
  @MemberGetter public static native int kDtypeFieldNumber();
  public static final int kDtypeFieldNumber = kDtypeFieldNumber();
  public native @Cast("tensorflow::DataType") int dtype();
  public native void set_dtype(@Cast("tensorflow::DataType") int value);
}
