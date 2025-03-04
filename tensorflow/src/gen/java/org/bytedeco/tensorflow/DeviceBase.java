// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DeviceBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceBase(Pointer p) { super(p); }

  public DeviceBase(Env env) { super((Pointer)null); allocate(env); }
  private native void allocate(Env env);

  public native Env env();

  // Override this to return true for devices that require an Op's
  // compute method to save references to the temporary tensors it
  // allocates until the Op execution completes
  public native @Cast("bool") boolean RequiresRecordingAccessedTensors();

  public static class CpuWorkerThreads extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public CpuWorkerThreads() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public CpuWorkerThreads(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public CpuWorkerThreads(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public CpuWorkerThreads position(long position) {
          return (CpuWorkerThreads)super.position(position);
      }
  
    public native int num_threads(); public native CpuWorkerThreads num_threads(int setter);
    public native ThreadPool workers(); public native CpuWorkerThreads workers(ThreadPool setter);
  }

  // Does not take ownership.
  public native void set_tensorflow_cpu_worker_threads(CpuWorkerThreads t);

  public native @Const CpuWorkerThreads tensorflow_cpu_worker_threads();

  // "stream" is used in special circumstances (such as the
  // constructors of Ops) where there is no available OpKernelContext.
  // "default_context" is used by OpKernelContext whenever a device does not
  // supply a DeviceContext for an op in FillContextMap (e.g. when only
  // using a single stream.)
  // "event_mgr" is used to delay deallocation of temporary GPU buffers.
  // TODO(pbar) Work out how to move this out of DeviceBase.
  // GpuDeviceInfo name is an unfortunate legacy, it is used not only by GPUs
  // but also by TPU devices (to provide default device context).
  public static class GpuDeviceInfo extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public GpuDeviceInfo() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public GpuDeviceInfo(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public GpuDeviceInfo(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public GpuDeviceInfo position(long position) {
          return (GpuDeviceInfo)super.position(position);
      }
  
    // Make sure all the defaults are NULL, so we can spot missing assignments.
    public native Stream stream(); public native GpuDeviceInfo stream(Stream setter);
    public native DeviceContext default_context(); public native GpuDeviceInfo default_context(DeviceContext setter);
    public native EventMgr event_mgr(); public native GpuDeviceInfo event_mgr(EventMgr setter);
    public native int gpu_id(); public native GpuDeviceInfo gpu_id(int setter);
  }

  // Does not take ownership.
  public native void set_tensorflow_gpu_device_info(GpuDeviceInfo g);

  public native @Const GpuDeviceInfo tensorflow_gpu_device_info();

  // The preferred thread pool for this device. If it is nullptr, the system
  // automatically assigns a thread pool for execution.
  public native ThreadPool tensorflow_device_thread_pool();

  // Does not take ownership.
  public native void set_eigen_cpu_device(ThreadPoolDevice d);

// #ifdef TENSORFLOW_USE_SYCL
// #endif

  // Return the Allocator implementation to use based on the allocator
  // attributes requested.  See allocator.h for more details.
  public native Allocator GetAllocator(@ByVal AllocatorAttributes arg0);

  // This method is provided for backwards compatibility, and will be removed
  // in a future release.
  public native Allocator GetStepAllocator(@ByVal AllocatorAttributes attr, ResourceMgr arg1);

  // Return an Allocator prepared for use in particular places by graph
  // optimization
  public native Allocator GetScopedAllocator(@ByVal AllocatorAttributes attr,
                                          @Cast("tensorflow::int64") long step_id);

  public native ScopedAllocatorMgr GetScopedAllocatorMgr();

  public native @Cast("bool") boolean has_eigen_cpu_device();

  public native @Const ThreadPoolDevice eigen_cpu_device();

// #ifdef TENSORFLOW_USE_SYCL
// #endif

  // Caller owns the return value. The OpKernelContext calls this even
  // for devices that do not implement an eigen_gpu_device. Overridden
  // by GPU devices to return a derived type.
  public native PerOpGpuDevice MakeGpuDevice();

  public native DeviceBase UnderlyingDevice();

  // This is overridden by GPU devices to reinitialize the derived
  // type returned by MakeGpuDevice.
  public native @ByVal Status ReinitializeGpuDevice(OpKernelContext arg0,
                                         PerOpGpuDevice arg1,
                                         DeviceContext arg2,
                                         Allocator arg3);

  // Unimplemented by default
  public native @Const @ByRef DeviceAttributes attributes();
  public native @StdString BytePointer name();

  // Materializes the given TensorProto into 'tensor' stored in Device
  // memory.  Most devices will want to override this.
  //
  // TODO(vrv): We should be able to put this function into
  // OpKernelContext and handle the copies from device memory via send
  // and receive nodes, instead of requiring that each device handle
  // the copies here as well as in copy ops.
  public native @ByVal Status MakeTensorFromProto(@Const @ByRef TensorProto tensor_proto,
                                       @Const @ByVal AllocatorAttributes alloc_attrs,
                                       Tensor tensor);

  // Some devices (i.e. GPUs) may free device memory prior to its actual use
  // being completed on the assumption that subsequent allocations can only be
  // used serially with respect to pending uses.  If this function returns a
  // non-zero value it is the value of a device-specific counter such that any
  // device memory tagged with an earlier freed-at count is really unencumbered
  // by pending uses.  For this to be useful the device memory allocator must
  // be tagging deallocated memory chunks using the same counter.
  public native @Cast("tensorflow::uint64") long SafeAllocFrontier(@Cast("tensorflow::uint64") long old_value);

  // Copies `input_tensor` to `output_tensor`, where both tensors are on this
  // device. This function assumes that `output_tensor` has already been
  // allocated with a buffer that is large enough to hold `input_tensor`'s data.
  // Calls `done` from a device-specific thread after copy is finished, which
  // may be the same as calling thread.
  //
  // NOTE(ayushd): This function is for TensorFlow internal use only.  Deep copy
  // is discouraged and should not be used in OpKernels.
  public native void CopyTensorInSameDevice(@Const Tensor input_tensor,
                                        Tensor output_tensor,
                                        @Const DeviceContext device_context,
                                        @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);
}
