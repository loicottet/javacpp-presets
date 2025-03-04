// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DebugTensorWatch extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DebugTensorWatch(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DebugTensorWatch(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DebugTensorWatch position(long position) {
        return (DebugTensorWatch)super.position(position);
    }

  public DebugTensorWatch() { super((Pointer)null); allocate(); }
  private native void allocate();

  public DebugTensorWatch(@Const @ByRef DebugTensorWatch from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef DebugTensorWatch from);

  public native @ByRef @Name("operator =") DebugTensorWatch put(@Const @ByRef DebugTensorWatch from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef DebugTensorWatch default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const DebugTensorWatch internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(DebugTensorWatch other);
  public native void Swap(DebugTensorWatch other);
  

  // implements Message ----------------------------------------------

  public native DebugTensorWatch New();

  public native DebugTensorWatch New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef DebugTensorWatch from);
  public native void MergeFrom(@Const @ByRef DebugTensorWatch from);
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

  // repeated string debug_ops = 3;
  public native int debug_ops_size();
  public native void clear_debug_ops();
  @MemberGetter public static native int kDebugOpsFieldNumber();
  public static final int kDebugOpsFieldNumber = kDebugOpsFieldNumber();
  public native @StdString BytePointer debug_ops(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_debug_ops(int index);
  public native void set_debug_ops(int index, @StdString BytePointer value);
  public native void set_debug_ops(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_debug_ops(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_debug_ops(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_debug_ops();
  public native void add_debug_ops(@StdString BytePointer value);
  public native void add_debug_ops(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_debug_ops(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_debug_ops(String value, @Cast("size_t") long size);

  // repeated string debug_urls = 4;
  public native int debug_urls_size();
  public native void clear_debug_urls();
  @MemberGetter public static native int kDebugUrlsFieldNumber();
  public static final int kDebugUrlsFieldNumber = kDebugUrlsFieldNumber();
  public native @StdString BytePointer debug_urls(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_debug_urls(int index);
  public native void set_debug_urls(int index, @StdString BytePointer value);
  public native void set_debug_urls(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_debug_urls(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_debug_urls(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_debug_urls();
  public native void add_debug_urls(@StdString BytePointer value);
  public native void add_debug_urls(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_debug_urls(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_debug_urls(String value, @Cast("size_t") long size);

  // string node_name = 1;
  public native void clear_node_name();
  @MemberGetter public static native int kNodeNameFieldNumber();
  public static final int kNodeNameFieldNumber = kNodeNameFieldNumber();
  public native @StdString BytePointer node_name();
  public native void set_node_name(@StdString BytePointer value);
  public native void set_node_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_node_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_node_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_node_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_node_name();
  public native void set_allocated_node_name(@StdString @Cast({"char*", "std::string*"}) BytePointer node_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_node_name();
  public native void unsafe_arena_set_allocated_node_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer node_name);

  // int32 output_slot = 2;
  public native void clear_output_slot();
  @MemberGetter public static native int kOutputSlotFieldNumber();
  public static final int kOutputSlotFieldNumber = kOutputSlotFieldNumber();
  public native @Cast("google::protobuf::int32") int output_slot();
  public native void set_output_slot(@Cast("google::protobuf::int32") int value);

  // bool tolerate_debug_op_creation_failures = 5;
  public native void clear_tolerate_debug_op_creation_failures();
  @MemberGetter public static native int kTolerateDebugOpCreationFailuresFieldNumber();
  public static final int kTolerateDebugOpCreationFailuresFieldNumber = kTolerateDebugOpCreationFailuresFieldNumber();
  public native @Cast("bool") boolean tolerate_debug_op_creation_failures();
  public native void set_tolerate_debug_op_creation_failures(@Cast("bool") boolean value);
}
