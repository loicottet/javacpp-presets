// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AttrValue_ListValue extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AttrValue_ListValue(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AttrValue_ListValue(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AttrValue_ListValue position(long position) {
        return (AttrValue_ListValue)super.position(position);
    }

  public AttrValue_ListValue() { super((Pointer)null); allocate(); }
  private native void allocate();

  public AttrValue_ListValue(@Const @ByRef AttrValue_ListValue from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef AttrValue_ListValue from);

  public native @ByRef @Name("operator =") AttrValue_ListValue put(@Const @ByRef AttrValue_ListValue from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef AttrValue_ListValue default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const AttrValue_ListValue internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(AttrValue_ListValue other);
  public native void Swap(AttrValue_ListValue other);
  

  // implements Message ----------------------------------------------

  public native AttrValue_ListValue New();

  public native AttrValue_ListValue New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef AttrValue_ListValue from);
  public native void MergeFrom(@Const @ByRef AttrValue_ListValue from);
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

  // repeated bytes s = 2;
  public native int s_size();
  public native void clear_s();
  @MemberGetter public static native int kSFieldNumber();
  public static final int kSFieldNumber = kSFieldNumber();
  public native @StdString BytePointer s(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_s(int index);
  public native void set_s(int index, @StdString BytePointer value);
  public native void set_s(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_s(int index, @Const Pointer value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_s();
  public native void add_s(@StdString BytePointer value);
  public native void add_s(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_s(@Const Pointer value, @Cast("size_t") long size);

  // repeated int64 i = 3 [packed = true];
  public native int i_size();
  public native void clear_i();
  @MemberGetter public static native int kIFieldNumber();
  public static final int kIFieldNumber = kIFieldNumber();
  public native @Cast("google::protobuf::int64") long i(int index);
  public native void set_i(int index, @Cast("google::protobuf::int64") long value);
  public native void add_i(@Cast("google::protobuf::int64") long value);

  // repeated float f = 4 [packed = true];
  public native int f_size();
  public native void clear_f();
  @MemberGetter public static native int kFFieldNumber();
  public static final int kFFieldNumber = kFFieldNumber();
  public native float f(int index);
  public native void set_f(int index, float value);
  public native void add_f(float value);

  // repeated bool b = 5 [packed = true];
  public native int b_size();
  public native void clear_b();
  @MemberGetter public static native int kBFieldNumber();
  public static final int kBFieldNumber = kBFieldNumber();
  public native @Cast("bool") boolean b(int index);
  public native void set_b(int index, @Cast("bool") boolean value);
  public native void add_b(@Cast("bool") boolean value);

  // repeated .tensorflow.DataType type = 6 [packed = true];
  public native int type_size();
  public native void clear_type();
  @MemberGetter public static native int kTypeFieldNumber();
  public static final int kTypeFieldNumber = kTypeFieldNumber();
  public native @Cast("tensorflow::DataType") int type(int index);
  public native void set_type(int index, @Cast("tensorflow::DataType") int value);
  public native void add_type(@Cast("tensorflow::DataType") int value);

  // repeated .tensorflow.TensorShapeProto shape = 7;
  public native int shape_size();
  public native void clear_shape();
  @MemberGetter public static native int kShapeFieldNumber();
  public static final int kShapeFieldNumber = kShapeFieldNumber();
  public native TensorShapeProto mutable_shape(int index);
  public native @Const @ByRef TensorShapeProto shape(int index);
  public native TensorShapeProto add_shape();

  // repeated .tensorflow.TensorProto tensor = 8;
  public native int tensor_size();
  public native void clear_tensor();
  @MemberGetter public static native int kTensorFieldNumber();
  public static final int kTensorFieldNumber = kTensorFieldNumber();
  public native TensorProto mutable_tensor(int index);
  public native @Const @ByRef TensorProto tensor(int index);
  public native TensorProto add_tensor();

  // repeated .tensorflow.NameAttrList func = 9;
  public native int func_size();
  public native void clear_func();
  @MemberGetter public static native int kFuncFieldNumber();
  public static final int kFuncFieldNumber = kFuncFieldNumber();
  public native NameAttrList mutable_func(int index);
  public native @Const @ByRef NameAttrList func(int index);
  public native NameAttrList add_func();
}
