// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SavedConstant extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SavedConstant(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SavedConstant(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SavedConstant position(long position) {
        return (SavedConstant)super.position(position);
    }

  public SavedConstant() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SavedConstant(@Const @ByRef SavedConstant from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SavedConstant from);

  public native @ByRef @Name("operator =") SavedConstant put(@Const @ByRef SavedConstant from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef SavedConstant default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SavedConstant internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(SavedConstant other);
  public native void Swap(SavedConstant other);
  

  // implements Message ----------------------------------------------

  public native SavedConstant New();

  public native SavedConstant New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SavedConstant from);
  public native void MergeFrom(@Const @ByRef SavedConstant from);
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

  // string operation = 1;
  public native void clear_operation();
  @MemberGetter public static native int kOperationFieldNumber();
  public static final int kOperationFieldNumber = kOperationFieldNumber();
  public native @StdString BytePointer operation();
  public native void set_operation(@StdString BytePointer value);
  public native void set_operation(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_operation(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_operation(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_operation();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_operation();
  public native void set_allocated_operation(@StdString @Cast({"char*", "std::string*"}) BytePointer operation);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_operation();
  public native void unsafe_arena_set_allocated_operation(
        @StdString @Cast({"char*", "std::string*"}) BytePointer operation);
}
