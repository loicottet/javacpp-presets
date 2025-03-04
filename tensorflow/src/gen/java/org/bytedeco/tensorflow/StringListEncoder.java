// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Encodes sequences of strings and serialized protocol buffers into a string.
// Normal usage consists of zero or more calls to Append() and a single call to
// Finalize().
@Namespace("tensorflow::port") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringListEncoder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringListEncoder(Pointer p) { super(p); }


  // Encodes the given protocol buffer. This may not be called after Finalize().
  public native void Append(@Const @ByRef MessageLite m);

  // Encodes the given string. This may not be called after Finalize().
  public native void Append(@StdString BytePointer s);
  public native void Append(@StdString String s);

  // Signals end of the encoding process. No other calls are allowed after this.
  public native void Finalize();
}
