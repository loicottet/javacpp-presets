// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// A profiler which will start profiling when creating the object and will stop
// when either the object is destroyed or SerializedToString is called. It will
// profile all operations run under the given EagerContext.
// Multiple instances of it can be created, but at most one of them will profile
// for each EagerContext. Status() will return OK only for the instance that is
// profiling.
// Thread-safety: ProfilerSession is thread-safe.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ProfilerSession extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProfilerSession(Pointer p) { super(p); }

  // Creates and ProfilerSession and starts profiling.
  public static native @MoveUniquePtr ProfilerSession Create(
        ProfilerContext context);

  // Deletes an exsiting Profiler and enables starting a new one.

  public native @ByVal Status Status();

  public native @ByVal Status CollectData(RunMetadata run_metadata);
  public native @ByVal Status SerializeToString(@StdString @Cast({"char*", "std::string*"}) BytePointer content);
}
