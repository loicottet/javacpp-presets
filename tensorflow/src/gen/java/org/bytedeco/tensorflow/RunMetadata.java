// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RunMetadata extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RunMetadata(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RunMetadata(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RunMetadata position(long position) {
        return (RunMetadata)super.position(position);
    }

  public RunMetadata() { super((Pointer)null); allocate(); }
  private native void allocate();

  public RunMetadata(@Const @ByRef RunMetadata from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef RunMetadata from);

  public native @ByRef @Name("operator =") RunMetadata put(@Const @ByRef RunMetadata from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef RunMetadata default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const RunMetadata internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(RunMetadata other);
  public native void Swap(RunMetadata other);
  

  // implements Message ----------------------------------------------

  public native RunMetadata New();

  public native RunMetadata New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef RunMetadata from);
  public native void MergeFrom(@Const @ByRef RunMetadata from);
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

  // repeated .tensorflow.GraphDef partition_graphs = 3;
  public native int partition_graphs_size();
  public native void clear_partition_graphs();
  @MemberGetter public static native int kPartitionGraphsFieldNumber();
  public static final int kPartitionGraphsFieldNumber = kPartitionGraphsFieldNumber();
  public native GraphDef mutable_partition_graphs(int index);
  public native @Const @ByRef GraphDef partition_graphs(int index);
  public native GraphDef add_partition_graphs();

  // repeated .tensorflow.RunMetadata.FunctionGraphs function_graphs = 4;
  public native int function_graphs_size();
  public native void clear_function_graphs();
  @MemberGetter public static native int kFunctionGraphsFieldNumber();
  public static final int kFunctionGraphsFieldNumber = kFunctionGraphsFieldNumber();
  public native RunMetadata_FunctionGraphs mutable_function_graphs(int index);
  public native @Const @ByRef RunMetadata_FunctionGraphs function_graphs(int index);
  public native RunMetadata_FunctionGraphs add_function_graphs();

  // .tensorflow.StepStats step_stats = 1;
  public native @Cast("bool") boolean has_step_stats();
  public native void clear_step_stats();
  @MemberGetter public static native int kStepStatsFieldNumber();
  public static final int kStepStatsFieldNumber = kStepStatsFieldNumber();
  public native @Const @ByRef StepStats step_stats();
  public native StepStats release_step_stats();
  public native StepStats mutable_step_stats();
  public native void set_allocated_step_stats(StepStats step_stats);
  public native void unsafe_arena_set_allocated_step_stats(
        StepStats step_stats);
  public native StepStats unsafe_arena_release_step_stats();

  // .tensorflow.CostGraphDef cost_graph = 2;
  public native @Cast("bool") boolean has_cost_graph();
  public native void clear_cost_graph();
  @MemberGetter public static native int kCostGraphFieldNumber();
  public static final int kCostGraphFieldNumber = kCostGraphFieldNumber();
  public native @Const @ByRef CostGraphDef cost_graph();
  public native CostGraphDef release_cost_graph();
  public native CostGraphDef mutable_cost_graph();
  public native void set_allocated_cost_graph(CostGraphDef cost_graph);
  public native void unsafe_arena_set_allocated_cost_graph(
        CostGraphDef cost_graph);
  public native CostGraphDef unsafe_arena_release_cost_graph();
}
