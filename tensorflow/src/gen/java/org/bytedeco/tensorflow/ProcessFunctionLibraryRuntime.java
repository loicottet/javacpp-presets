// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// A class that stores all the FunctionLibraryRuntime objects, one per device.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ProcessFunctionLibraryRuntime extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProcessFunctionLibraryRuntime(Pointer p) { super(p); }

  // Creates FunctionLibraryRuntime objects for each device in the provided
  // DeviceMgr. Caller needs to make sure that device_mgr, lib_def and parent
  // (if provided) outlive this object.
  public ProcessFunctionLibraryRuntime(
        @Const DeviceMgr device_mgr, Env env, int graph_def_version,
        @Const FunctionLibraryDefinition lib_def,
        @Const @ByRef OptimizerOptions optimizer_options,
        ThreadPool thread_pool/*=nullptr*/,
        DistributedFunctionLibraryRuntime parent/*=nullptr*/,
        @Const CustomKernelCreator custom_kernel_creator/*=nullptr*/) { super((Pointer)null); allocate(device_mgr, env, graph_def_version, lib_def, optimizer_options, thread_pool, parent, custom_kernel_creator); }
  private native void allocate(
        @Const DeviceMgr device_mgr, Env env, int graph_def_version,
        @Const FunctionLibraryDefinition lib_def,
        @Const @ByRef OptimizerOptions optimizer_options,
        ThreadPool thread_pool/*=nullptr*/,
        DistributedFunctionLibraryRuntime parent/*=nullptr*/,
        @Const CustomKernelCreator custom_kernel_creator/*=nullptr*/);
  public ProcessFunctionLibraryRuntime(
        @Const DeviceMgr device_mgr, Env env, int graph_def_version,
        @Const FunctionLibraryDefinition lib_def,
        @Const @ByRef OptimizerOptions optimizer_options) { super((Pointer)null); allocate(device_mgr, env, graph_def_version, lib_def, optimizer_options); }
  private native void allocate(
        @Const DeviceMgr device_mgr, Env env, int graph_def_version,
        @Const FunctionLibraryDefinition lib_def,
        @Const @ByRef OptimizerOptions optimizer_options);

  // Sends `tensors_to_send` from `source_device` to `target_device` using
  // `rendezvous`. `key_prefix` is used as a prefix for the keys sent to the
  // Rendezvous. `device_context` should be the DeviceContext of the device
  // doing the sending. `alloc_attrs` should either be empty or be the size of
  // `tensors_to_send` and indicates how the input tensors are allocated. Method
  // takes references on each of the `tensors_to_send`. Method doesn't block.
  public static native @ByVal Status SendTensors(@StdString BytePointer source_device,
                              @StdString BytePointer target_device,
                              @StdString BytePointer key_prefix, @Cast("tensorflow::int64") long src_incarnation,
                              @ByVal TensorVector tensors_to_send,
                              DeviceContext device_context,
                              @StdVector AllocatorAttributes alloc_attrs,
                              Rendezvous rendezvous);
  public static native @ByVal Status SendTensors(@StdString String source_device,
                              @StdString String target_device,
                              @StdString String key_prefix, @Cast("tensorflow::int64") long src_incarnation,
                              @ByVal TensorVector tensors_to_send,
                              DeviceContext device_context,
                              @StdVector AllocatorAttributes alloc_attrs,
                              Rendezvous rendezvous);

  // Receives `received_tensors` from `target_device` (originally sent from
  // `source_device`) using `rendezvous`. Uses `key_prefix` to construct the
  // keys to be retrieved. `device_context` should be for the device receiving
  // the tensors. `alloc_attrs` indicates how to allocate the received
  // tensors and should either be empty or `num_tensors` in size. Method doesn't
  // block and calls `done` when `num_tensors` are fetched.
  public static native void ReceiveTensorsAsync(
        @StdString BytePointer source_device, @StdString BytePointer target_device,
        @StdString BytePointer key_prefix, @Cast("tensorflow::int64") long src_incarnation, @Cast("tensorflow::int64") long num_tensors,
        DeviceContext device_context,
        @StdVector AllocatorAttributes alloc_attrs,
        Rendezvous rendezvous, TensorVector received_tensors,
        @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);
  public static native void ReceiveTensorsAsync(
        @StdString String source_device, @StdString String target_device,
        @StdString String key_prefix, @Cast("tensorflow::int64") long src_incarnation, @Cast("tensorflow::int64") long num_tensors,
        DeviceContext device_context,
        @StdVector AllocatorAttributes alloc_attrs,
        Rendezvous rendezvous, TensorVector received_tensors,
        @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  @MemberGetter public static native byte kDefaultFLRDevice(int i);
  @MemberGetter public static native @Cast("const char*") BytePointer kDefaultFLRDevice();
  // Returns the FunctionLibraryRuntime for the corresponding device_name.
  public native FunctionLibraryRuntime GetFLR(@StdString BytePointer device_name);
  public native FunctionLibraryRuntime GetFLR(@StdString String device_name);

  // Returns the return types for the function identified by handle `h`.
  public native @ByVal Status GetRetTypes(@Cast("tensorflow::FunctionLibraryRuntime::Handle") long h,
                       DataTypeVector ret_types);

  // Returns the device incarnation for the given device_name.
  public native @ByVal Status GetDeviceIncarnation(@StdString BytePointer device_name,
                                @Cast("tensorflow::int64*") LongPointer incarnation);
  public native @ByVal Status GetDeviceIncarnation(@StdString String device_name,
                                @Cast("tensorflow::int64*") LongBuffer incarnation);
  public native @ByVal Status GetDeviceIncarnation(@StdString BytePointer device_name,
                                @Cast("tensorflow::int64*") long... incarnation);
  public native @ByVal Status GetDeviceIncarnation(@StdString String device_name,
                                @Cast("tensorflow::int64*") LongPointer incarnation);
  public native @ByVal Status GetDeviceIncarnation(@StdString BytePointer device_name,
                                @Cast("tensorflow::int64*") LongBuffer incarnation);
  public native @ByVal Status GetDeviceIncarnation(@StdString String device_name,
                                @Cast("tensorflow::int64*") long... incarnation);

  // For a given canonicalized key signature of the function instantiated
  // on device `device_name` and a `local_handle`, creates a handle and returns
  // that value. Uses core/common_runtime/framework/function.h::Canonicalize
  // to canonicalize the function signature.
  public native @Cast("tensorflow::FunctionLibraryRuntime::Handle") long AddHandle(
        @StdString BytePointer function_key, @StdString BytePointer device_name,
        @Cast("tensorflow::FunctionLibraryRuntime::LocalHandle") long local_handle);
  public native @Cast("tensorflow::FunctionLibraryRuntime::Handle") long AddHandle(
        @StdString String function_key, @StdString String device_name,
        @Cast("tensorflow::FunctionLibraryRuntime::LocalHandle") long local_handle);

  // Returns a handle if found for the given key, else returns kInvalidHandle.
  public native @Cast("tensorflow::FunctionLibraryRuntime::Handle") long GetHandle(@StdString BytePointer function_key);
  public native @Cast("tensorflow::FunctionLibraryRuntime::Handle") long GetHandle(@StdString String function_key);

  // For the given handle instantiated on device `device_name` returns the local
  // index of instantiation of that function. If the function was not
  // instantiated on `device_name` or the function is multi-device,
  // returns kInvalidLocalHandle.
  public native @Cast("tensorflow::FunctionLibraryRuntime::LocalHandle") long GetHandleOnDevice(
        @StdString BytePointer device_name, @Cast("tensorflow::FunctionLibraryRuntime::Handle") long handle);
  public native @Cast("tensorflow::FunctionLibraryRuntime::LocalHandle") long GetHandleOnDevice(
        @StdString String device_name, @Cast("tensorflow::FunctionLibraryRuntime::Handle") long handle);

  // Fills `output_devices` with the devices on which the results will
  // be produced. If some output is produced on CPU, the corresponding Device*
  // is set to nullptr. If some output is DT_RESOURCE, the corresponding Device*
  // is set to the device backing the resource.
  // REQUIRES: `handle` identifies a multi-device function.
  public native @ByVal Status GetOutputDevices(@Cast("tensorflow::FunctionLibraryRuntime::Handle") long handle,
                            DeviceVector output_devices);

  // Returns true if function with handle `handle` was instantiated on device
  // `device_name`. Returns false for multi-device functions.
  public native @Cast("bool") boolean IsInstantiatedOnDevice(@StdString BytePointer device_name,
                                @Cast("tensorflow::FunctionLibraryRuntime::Handle") long handle);
  public native @Cast("bool") boolean IsInstantiatedOnDevice(@StdString String device_name,
                                @Cast("tensorflow::FunctionLibraryRuntime::Handle") long handle);

  // Instantiates the function. See framework/function.h for more details.
  // Allows for function_name to be instantiated on different devices
  // as specified in attrs.
  public native @ByVal Status Instantiate(@StdString BytePointer function_name, @ByVal AttrSlice attrs,
                       @Const @ByRef FunctionLibraryRuntime.InstantiateOptions options,
                       @Cast("tensorflow::FunctionLibraryRuntime::Handle*") LongPointer handle);
  public native @ByVal Status Instantiate(@StdString String function_name, @ByVal AttrSlice attrs,
                       @Const @ByRef FunctionLibraryRuntime.InstantiateOptions options,
                       @Cast("tensorflow::FunctionLibraryRuntime::Handle*") LongBuffer handle);
  public native @ByVal Status Instantiate(@StdString BytePointer function_name, @ByVal AttrSlice attrs,
                       @Const @ByRef FunctionLibraryRuntime.InstantiateOptions options,
                       @Cast("tensorflow::FunctionLibraryRuntime::Handle*") long... handle);
  public native @ByVal Status Instantiate(@StdString String function_name, @ByVal AttrSlice attrs,
                       @Const @ByRef FunctionLibraryRuntime.InstantiateOptions options,
                       @Cast("tensorflow::FunctionLibraryRuntime::Handle*") LongPointer handle);
  public native @ByVal Status Instantiate(@StdString BytePointer function_name, @ByVal AttrSlice attrs,
                       @Const @ByRef FunctionLibraryRuntime.InstantiateOptions options,
                       @Cast("tensorflow::FunctionLibraryRuntime::Handle*") LongBuffer handle);
  public native @ByVal Status Instantiate(@StdString String function_name, @ByVal AttrSlice attrs,
                       @Const @ByRef FunctionLibraryRuntime.InstantiateOptions options,
                       @Cast("tensorflow::FunctionLibraryRuntime::Handle*") long... handle);

  // Delegates to the local FLR that owns state corresponding to `handle` and
  // tells it to release it. If the `handle` isnt' needed at all, the local FLR
  // might call RemoveHandle on this to get rid of the state owned by the Proc
  // FLR.
  // For multi-device functions, calls ReleaseHandle on local FLRs for each
  // component function that is part of this multi-device function.
  // Each local FLR might call RemoveHandle on this.
  public native @ByVal Status ReleaseHandle(@Cast("tensorflow::FunctionLibraryRuntime::Handle") long handle);

  // Runs the function with given `handle`. Function could have been
  // instantiated on any device. More details in framework/function.h
  public native void Run(@Const @ByRef FunctionLibraryRuntime.Options opts,
             @Cast("tensorflow::FunctionLibraryRuntime::Handle") long handle, @ByVal TensorVector args,
             TensorVector rets,
             @ByVal @Cast("tensorflow::FunctionLibraryRuntime::DoneCallback*") Pointer done);
  public native void Run(@Const @ByRef FunctionLibraryRuntime.Options opts,
             @Cast("tensorflow::FunctionLibraryRuntime::Handle") long handle, CallFrameInterface frame,
             @ByVal @Cast("tensorflow::FunctionLibraryRuntime::DoneCallback*") Pointer done);

  public native @Const DeviceMgr device_mgr();
}
