// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MetaGraphDef_MetaInfoDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MetaGraphDef_MetaInfoDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MetaGraphDef_MetaInfoDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MetaGraphDef_MetaInfoDef position(long position) {
        return (MetaGraphDef_MetaInfoDef)super.position(position);
    }

  public MetaGraphDef_MetaInfoDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public MetaGraphDef_MetaInfoDef(@Const @ByRef MetaGraphDef_MetaInfoDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef MetaGraphDef_MetaInfoDef from);

  public native @ByRef @Name("operator =") MetaGraphDef_MetaInfoDef put(@Const @ByRef MetaGraphDef_MetaInfoDef from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef MetaGraphDef_MetaInfoDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const MetaGraphDef_MetaInfoDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(MetaGraphDef_MetaInfoDef other);
  public native void Swap(MetaGraphDef_MetaInfoDef other);
  

  // implements Message ----------------------------------------------

  public native MetaGraphDef_MetaInfoDef New();

  public native MetaGraphDef_MetaInfoDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef MetaGraphDef_MetaInfoDef from);
  public native void MergeFrom(@Const @ByRef MetaGraphDef_MetaInfoDef from);
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

  // repeated string tags = 4;
  public native int tags_size();
  public native void clear_tags();
  @MemberGetter public static native int kTagsFieldNumber();
  public static final int kTagsFieldNumber = kTagsFieldNumber();
  public native @StdString BytePointer tags(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_tags(int index);
  public native void set_tags(int index, @StdString BytePointer value);
  public native void set_tags(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_tags(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_tags(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_tags();
  public native void add_tags(@StdString BytePointer value);
  public native void add_tags(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_tags(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_tags(String value, @Cast("size_t") long size);

  // string meta_graph_version = 1;
  public native void clear_meta_graph_version();
  @MemberGetter public static native int kMetaGraphVersionFieldNumber();
  public static final int kMetaGraphVersionFieldNumber = kMetaGraphVersionFieldNumber();
  public native @StdString BytePointer meta_graph_version();
  public native void set_meta_graph_version(@StdString BytePointer value);
  public native void set_meta_graph_version(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_meta_graph_version(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_meta_graph_version(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_meta_graph_version();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_meta_graph_version();
  public native void set_allocated_meta_graph_version(@StdString @Cast({"char*", "std::string*"}) BytePointer meta_graph_version);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_meta_graph_version();
  public native void unsafe_arena_set_allocated_meta_graph_version(
        @StdString @Cast({"char*", "std::string*"}) BytePointer meta_graph_version);

  // string tensorflow_version = 5;
  public native void clear_tensorflow_version();
  @MemberGetter public static native int kTensorflowVersionFieldNumber();
  public static final int kTensorflowVersionFieldNumber = kTensorflowVersionFieldNumber();
  public native @StdString BytePointer tensorflow_version();
  public native void set_tensorflow_version(@StdString BytePointer value);
  public native void set_tensorflow_version(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_tensorflow_version(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_tensorflow_version(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_tensorflow_version();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_tensorflow_version();
  public native void set_allocated_tensorflow_version(@StdString @Cast({"char*", "std::string*"}) BytePointer tensorflow_version);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_tensorflow_version();
  public native void unsafe_arena_set_allocated_tensorflow_version(
        @StdString @Cast({"char*", "std::string*"}) BytePointer tensorflow_version);

  // string tensorflow_git_version = 6;
  public native void clear_tensorflow_git_version();
  @MemberGetter public static native int kTensorflowGitVersionFieldNumber();
  public static final int kTensorflowGitVersionFieldNumber = kTensorflowGitVersionFieldNumber();
  public native @StdString BytePointer tensorflow_git_version();
  public native void set_tensorflow_git_version(@StdString BytePointer value);
  public native void set_tensorflow_git_version(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_tensorflow_git_version(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_tensorflow_git_version(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_tensorflow_git_version();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_tensorflow_git_version();
  public native void set_allocated_tensorflow_git_version(@StdString @Cast({"char*", "std::string*"}) BytePointer tensorflow_git_version);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_tensorflow_git_version();
  public native void unsafe_arena_set_allocated_tensorflow_git_version(
        @StdString @Cast({"char*", "std::string*"}) BytePointer tensorflow_git_version);

  // .tensorflow.OpList stripped_op_list = 2;
  public native @Cast("bool") boolean has_stripped_op_list();
  public native void clear_stripped_op_list();
  @MemberGetter public static native int kStrippedOpListFieldNumber();
  public static final int kStrippedOpListFieldNumber = kStrippedOpListFieldNumber();
  public native @Const @ByRef OpList stripped_op_list();
  public native OpList release_stripped_op_list();
  public native OpList mutable_stripped_op_list();
  public native void set_allocated_stripped_op_list(OpList stripped_op_list);
  public native void unsafe_arena_set_allocated_stripped_op_list(
        OpList stripped_op_list);
  public native OpList unsafe_arena_release_stripped_op_list();

  // .google.protobuf.Any any_info = 3;
  public native @Cast("bool") boolean has_any_info();
  public native void clear_any_info();
  @MemberGetter public static native int kAnyInfoFieldNumber();
  public static final int kAnyInfoFieldNumber = kAnyInfoFieldNumber();
  public native @Cast("const google::protobuf::Any*") @ByRef Pointer any_info();
  public native @Cast("google::protobuf::Any*") Pointer release_any_info();
  public native @Cast("google::protobuf::Any*") Pointer mutable_any_info();
  public native void set_allocated_any_info(@Cast("google::protobuf::Any*") Pointer any_info);
  public native void unsafe_arena_set_allocated_any_info(
        @Cast("google::protobuf::Any*") Pointer any_info);
  public native @Cast("google::protobuf::Any*") Pointer unsafe_arena_release_any_info();

  // bool stripped_default_attrs = 7;
  public native void clear_stripped_default_attrs();
  @MemberGetter public static native int kStrippedDefaultAttrsFieldNumber();
  public static final int kStrippedDefaultAttrsFieldNumber = kStrippedDefaultAttrsFieldNumber();
  public native @Cast("bool") boolean stripped_default_attrs();
  public native void set_stripped_default_attrs(@Cast("bool") boolean value);
}
