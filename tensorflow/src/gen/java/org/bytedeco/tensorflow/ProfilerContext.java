// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ProfilerContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ProfilerContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ProfilerContext(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProfilerContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ProfilerContext position(long position) {
        return (ProfilerContext)super.position(position);
    }

  public native EagerContext eager_context(); public native ProfilerContext eager_context(EagerContext setter);
}
