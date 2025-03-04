// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ExecutorOpts extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExecutorOpts(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ExecutorOpts(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ExecutorOpts position(long position) {
        return (ExecutorOpts)super.position(position);
    }

  public ExecutorOpts() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ExecutorOpts(@Const @ByRef ExecutorOpts from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ExecutorOpts from);

  public native @ByRef @Name("operator =") ExecutorOpts put(@Const @ByRef ExecutorOpts from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef ExecutorOpts default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ExecutorOpts internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(ExecutorOpts other);
  public native void Swap(ExecutorOpts other);
  

  // implements Message ----------------------------------------------

  public native ExecutorOpts New();

  public native ExecutorOpts New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef ExecutorOpts from);
  public native void MergeFrom(@Const @ByRef ExecutorOpts from);
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

  // bool record_costs = 1;
  public native void clear_record_costs();
  @MemberGetter public static native int kRecordCostsFieldNumber();
  public static final int kRecordCostsFieldNumber = kRecordCostsFieldNumber();
  public native @Cast("bool") boolean record_costs();
  public native void set_record_costs(@Cast("bool") boolean value);

  // bool record_timeline = 3;
  public native void clear_record_timeline();
  @MemberGetter public static native int kRecordTimelineFieldNumber();
  public static final int kRecordTimelineFieldNumber = kRecordTimelineFieldNumber();
  public native @Cast("bool") boolean record_timeline();
  public native void set_record_timeline(@Cast("bool") boolean value);

  // bool record_partition_graphs = 4;
  public native void clear_record_partition_graphs();
  @MemberGetter public static native int kRecordPartitionGraphsFieldNumber();
  public static final int kRecordPartitionGraphsFieldNumber = kRecordPartitionGraphsFieldNumber();
  public native @Cast("bool") boolean record_partition_graphs();
  public native void set_record_partition_graphs(@Cast("bool") boolean value);

  // bool report_tensor_allocations_upon_oom = 5;
  public native void clear_report_tensor_allocations_upon_oom();
  @MemberGetter public static native int kReportTensorAllocationsUponOomFieldNumber();
  public static final int kReportTensorAllocationsUponOomFieldNumber = kReportTensorAllocationsUponOomFieldNumber();
  public native @Cast("bool") boolean report_tensor_allocations_upon_oom();
  public native void set_report_tensor_allocations_upon_oom(@Cast("bool") boolean value);
}
