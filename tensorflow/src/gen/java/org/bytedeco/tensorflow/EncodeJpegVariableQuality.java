// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** JPEG encode input image with provided compression quality.
 * 
 *  {@code image} is a 3-D uint8 Tensor of shape {@code [height, width, channels]}.
 *  {@code quality} is an int32 jpeg compression quality value between 0 and 100.
 * 
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * images: Images to adjust.  At least 3-D.
 *  * quality: An int quality to encode to.
 * 
 *  Returns:
 *  * {@code Output}: 0-D. JPEG-encoded image. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EncodeJpegVariableQuality extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EncodeJpegVariableQuality(Pointer p) { super(p); }

  public EncodeJpegVariableQuality(@Const @ByRef Scope scope, @ByVal Input images, @ByVal Input quality) { super((Pointer)null); allocate(scope, images, quality); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images, @ByVal Input quality);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native EncodeJpegVariableQuality operation(Operation setter);
  public native @ByRef Output contents(); public native EncodeJpegVariableQuality contents(Output setter);
}
