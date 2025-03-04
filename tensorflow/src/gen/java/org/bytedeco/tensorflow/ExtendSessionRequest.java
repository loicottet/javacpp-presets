// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ExtendSessionRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExtendSessionRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ExtendSessionRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ExtendSessionRequest position(long position) {
        return (ExtendSessionRequest)super.position(position);
    }

  public ExtendSessionRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ExtendSessionRequest(@Const @ByRef ExtendSessionRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ExtendSessionRequest from);

  public native @ByRef @Name("operator =") ExtendSessionRequest put(@Const @ByRef ExtendSessionRequest from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef ExtendSessionRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ExtendSessionRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(ExtendSessionRequest other);
  public native void Swap(ExtendSessionRequest other);
  

  // implements Message ----------------------------------------------

  public native ExtendSessionRequest New();

  public native ExtendSessionRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef ExtendSessionRequest from);
  public native void MergeFrom(@Const @ByRef ExtendSessionRequest from);
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

  // string session_handle = 1;
  public native void clear_session_handle();
  @MemberGetter public static native int kSessionHandleFieldNumber();
  public static final int kSessionHandleFieldNumber = kSessionHandleFieldNumber();
  public native @StdString BytePointer session_handle();
  public native void set_session_handle(@StdString BytePointer value);
  public native void set_session_handle(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_session_handle(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_session_handle(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_session_handle();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_session_handle();
  public native void set_allocated_session_handle(@StdString @Cast({"char*", "std::string*"}) BytePointer session_handle);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_session_handle();
  public native void unsafe_arena_set_allocated_session_handle(
        @StdString @Cast({"char*", "std::string*"}) BytePointer session_handle);

  // .tensorflow.GraphDef graph_def = 2;
  public native @Cast("bool") boolean has_graph_def();
  public native void clear_graph_def();
  @MemberGetter public static native int kGraphDefFieldNumber();
  public static final int kGraphDefFieldNumber = kGraphDefFieldNumber();
  public native @Const @ByRef GraphDef graph_def();
  public native GraphDef release_graph_def();
  public native GraphDef mutable_graph_def();
  public native void set_allocated_graph_def(GraphDef graph_def);
  public native void unsafe_arena_set_allocated_graph_def(
        GraphDef graph_def);
  public native GraphDef unsafe_arena_release_graph_def();

  // int64 current_graph_version = 3;
  public native void clear_current_graph_version();
  @MemberGetter public static native int kCurrentGraphVersionFieldNumber();
  public static final int kCurrentGraphVersionFieldNumber = kCurrentGraphVersionFieldNumber();
  public native @Cast("google::protobuf::int64") long current_graph_version();
  public native void set_current_graph_version(@Cast("google::protobuf::int64") long value);
}
