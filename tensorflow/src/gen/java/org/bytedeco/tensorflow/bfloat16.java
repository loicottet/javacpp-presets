// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// see framework/bfloat16.h for description.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class bfloat16 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public bfloat16(Pointer p) { super(p); }

  // The default constructor must yield a zero value, not an uninitialized
  // value; some TF kernels use T() as a zero value.
  public bfloat16() { super((Pointer)null); allocate(); }
  private native void allocate();

  public static native @ByVal bfloat16 truncate_to_bfloat16(float v);

  public bfloat16(float v) { super((Pointer)null); allocate(v); }
  private native void allocate(float v);

  public bfloat16(double val) { super((Pointer)null); allocate(val); }
  private native void allocate(double val);
  // Following the convention of numpy, converting between complex and
  // float will lead to loss of imag value.
  public bfloat16(@Cast("const tensorflow::complex64*") @ByRef FloatPointer val) { super((Pointer)null); allocate(val); }
  private native void allocate(@Cast("const tensorflow::complex64*") @ByRef FloatPointer val);
  public bfloat16(@Cast("const tensorflow::complex64*") @ByRef FloatBuffer val) { super((Pointer)null); allocate(val); }
  private native void allocate(@Cast("const tensorflow::complex64*") @ByRef FloatBuffer val);
  public bfloat16(@Cast("const tensorflow::complex64*") @ByRef float... val) { super((Pointer)null); allocate(val); }
  private native void allocate(@Cast("const tensorflow::complex64*") @ByRef float... val);

  public bfloat16(@Cast("const tensorflow::complex128*") @ByRef DoublePointer val) { super((Pointer)null); allocate(val); }
  private native void allocate(@Cast("const tensorflow::complex128*") @ByRef DoublePointer val);
  public bfloat16(@Cast("const tensorflow::complex128*") @ByRef DoubleBuffer val) { super((Pointer)null); allocate(val); }
  private native void allocate(@Cast("const tensorflow::complex128*") @ByRef DoubleBuffer val);
  public bfloat16(@Cast("const tensorflow::complex128*") @ByRef double[] val) { super((Pointer)null); allocate(val); }
  private native void allocate(@Cast("const tensorflow::complex128*") @ByRef double[] val);

  public bfloat16(@Cast("const unsigned short") short val) { super((Pointer)null); allocate(val); }
  private native void allocate(@Cast("const unsigned short") short val);

  public bfloat16(@Cast("const unsigned int") int val) { super((Pointer)null); allocate(val); }
  private native void allocate(@Cast("const unsigned int") int val);

  public bfloat16(long val) { super((Pointer)null); allocate(val); }
  private native void allocate(long val);

  public native @Name("operator float") float asFloat();

  public native @Cast("bool") @Name("operator bool") boolean asBoolean();

  public native @Cast("Eigen::half") @Name("operator Eigen::half") short asShort();

  public native @Name("operator int") int asInt();

  public native @Name("operator long") long asLong();

  public native @Cast("char") @Name("operator char") byte asByte();

  public native @Name("operator double") double asDouble();

  public native @ByVal @Cast("tensorflow::complex64*") @Name("operator tensorflow::complex64") FloatPointer asFloatPointer();

  public native @ByVal @Cast("tensorflow::complex128*") @Name("operator tensorflow::complex128") DoublePointer asDoublePointer();

  public static class FP32 extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public FP32() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public FP32(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FP32(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public FP32 position(long position) {
          return (FP32)super.position(position);
      }
  
    public native @Cast("unsigned int") int u(); public native FP32 u(int setter);
    public native float f(); public native FP32 f(float setter);
  }

  // Converts a float point to bfloat16, with round-nearest-to-even as rounding
  // method.
  // TODO: There is a slightly faster implementation (8% faster on CPU)
  // than this (documented in cl/175987786), that is exponentially harder to
  // understand and document. Switch to the faster version when converting to
  // BF16 becomes compute-bound.
  public static native @ByVal bfloat16 round_to_bfloat16(float v);

  public static native @ByVal bfloat16 epsilon();

  public static native @ByVal bfloat16 highest();

  public static native @ByVal bfloat16 lowest();

  public static native @ByVal bfloat16 min_positive_normal();

  public native @Cast("bool") boolean IsZero();

  public native @Cast("uint16_t") short value(); public native bfloat16 value(short setter);

  // A value that represents "not a number".
  @MemberGetter public static native @Cast("const uint16_t") short NAN_VALUE();
  public static final short NAN_VALUE = NAN_VALUE();
}
