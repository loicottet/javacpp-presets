// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TFE_MonitoringBuckets extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TFE_MonitoringBuckets(Pointer p) { super(p); }

  public TFE_MonitoringBuckets(
        @ByVal CreateBuckets fn) { super((Pointer)null); allocate(fn); }
  private native void allocate(
        @ByVal CreateBuckets fn);

  @MemberSetter public native TFE_MonitoringBuckets create_buckets(@ByVal CreateBuckets create_buckets);
}
