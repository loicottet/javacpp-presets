// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_multifit_fsolver extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_multifit_fsolver() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_multifit_fsolver(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_multifit_fsolver(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_multifit_fsolver position(long position) {
        return (gsl_multifit_fsolver)super.position(position);
    }

    public native @Const gsl_multifit_fsolver_type type(); public native gsl_multifit_fsolver type(gsl_multifit_fsolver_type setter);
    public native gsl_multifit_function function(); public native gsl_multifit_fsolver function(gsl_multifit_function setter);
    public native gsl_vector x(); public native gsl_multifit_fsolver x(gsl_vector setter);
    public native gsl_vector f(); public native gsl_multifit_fsolver f(gsl_vector setter);
    public native gsl_vector dx(); public native gsl_multifit_fsolver dx(gsl_vector setter);
    public native Pointer state(); public native gsl_multifit_fsolver state(Pointer setter);
  }
