// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


@Name("TessResultCallback2<bool,const char&,const char&>") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class CharCompareCallback extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CharCompareCallback() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CharCompareCallback(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CharCompareCallback(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CharCompareCallback position(long position) {
        return (CharCompareCallback)super.position(position);
    }

  @Virtual(true) public native @Cast("bool") boolean Run(@Cast("const char") @ByRef byte arg0, @Cast("const char") @ByRef byte arg1);
}
