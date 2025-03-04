// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// The worker environment class, which holds a bag of pointers to
// per-worker singletons.
//
// WorkerEnv does not own its member pointers.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class WorkerEnv extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public WorkerEnv() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WorkerEnv(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WorkerEnv(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public WorkerEnv position(long position) {
        return (WorkerEnv)super.position(position);
    }

  public native Env env(); public native WorkerEnv env(Env setter);

  // session_mgr encapsulates state for each session.
  public native SessionMgr session_mgr(); public native WorkerEnv session_mgr(SessionMgr setter);

  // The local devices of this worker. Devices are owned by the device_mgr.
  //
  // REQUIRES: !local_devices.empty().
  public native @ByRef DeviceVector local_devices(); public native WorkerEnv local_devices(DeviceVector setter);

  // device_mgr manages local devices (cpu and gpu). The WorkerService
  // is the network interface for managed devices.
  //
  // Note: Please use the device_mgr associated with your session if appropriate
  // instead of this one. Using this device_mgr does not support ClusterSpec
  // propagated sessions.
  public native DeviceMgr device_mgr(); public native WorkerEnv device_mgr(DeviceMgr setter);

  // A set of rendezvous keyed by step ids.
  public native RendezvousMgrInterface rendezvous_mgr(); public native WorkerEnv rendezvous_mgr(RendezvousMgrInterface setter);

  // Generates per-step CollectiveExecutors and has access to utilities
  // supporting collective operations.
  public native CollectiveExecutorMgrInterface collective_executor_mgr(); public native WorkerEnv collective_executor_mgr(CollectiveExecutorMgrInterface setter);

  // A pool of threads for scheduling compute work.
  public native ThreadPool compute_pool(); public native WorkerEnv compute_pool(ThreadPool setter);
}
