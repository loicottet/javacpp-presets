// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;

@Namespace("tesseract") @Opaque @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class EquationDetect extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public EquationDetect() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EquationDetect(Pointer p) { super(p); }
}
