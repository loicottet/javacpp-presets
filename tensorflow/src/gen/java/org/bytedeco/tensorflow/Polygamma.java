// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Compute the polygamma function \(\psi^{(n)}(x)\).
 * 
 *  The polygamma function is defined as:
 * 
 * 
 *  \(\psi^{(a)}(x) = \frac{d^a}{dx^a} \psi(x)\)
 * 
 *  where \(\psi(x)\) is the digamma function.
 *  The polygamma function is defined only for non-negative integer orders \a\.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The z tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Polygamma extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Polygamma(Pointer p) { super(p); }

  public Polygamma(@Const @ByRef Scope scope, @ByVal Input a,
            @ByVal Input x) { super((Pointer)null); allocate(scope, a, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input a,
            @ByVal Input x);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Polygamma operation(Operation setter);
  public native @ByRef Output z(); public native Polygamma z(Output setter);
}
