// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;


/** \brief Line iterator
<p>
The class is used to iterate over all the pixels on the raster line
segment connecting two specified points.
<p>
The class LineIterator is used to get each pixel of a raster line. It
can be treated as versatile implementation of the Bresenham algorithm
where you can stop at each pixel and do some extra processing, for
example, grab pixel values along the line or draw a line with an effect
(for example, with XOR operation).
<p>
The number of pixels along the line is stored in LineIterator::count.
The method LineIterator::pos returns the current position in the image:
<p>
<pre>{@code {.cpp}
// grabs pixels along the line (pt1, pt2)
// from 8-bit 3-channel image to the buffer
LineIterator it(img, pt1, pt2, 8);
LineIterator it2 = it;
vector<Vec3b> buf(it.count);

for(int i = 0; i < it.count; i++, ++it)
    buf[i] = *(const Vec3b*)*it;

// alternative way of iterating through the line
for(int i = 0; i < it2.count; i++, ++it2)
{
    Vec3b val = img.at<Vec3b>(it2.pos());
    CV_Assert(buf[i] == val);
}
}</pre>
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class LineIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LineIterator(Pointer p) { super(p); }

    /** \brief initializes the iterator
    <p>
    creates iterators for the line connecting pt1 and pt2
    the line will be clipped on the image boundaries
    the line is 8-connected or 4-connected
    If leftToRight=true, then the iteration is always done
    from the left-most point to the right most,
    not to depend on the ordering of pt1 and pt2 parameters
    */
    public LineIterator( @Const @ByRef Mat img, @ByVal Point pt1, @ByVal Point pt2,
                      int connectivity/*=8*/, @Cast("bool") boolean leftToRight/*=false*/ ) { super((Pointer)null); allocate(img, pt1, pt2, connectivity, leftToRight); }
    private native void allocate( @Const @ByRef Mat img, @ByVal Point pt1, @ByVal Point pt2,
                      int connectivity/*=8*/, @Cast("bool") boolean leftToRight/*=false*/ );
    public LineIterator( @Const @ByRef Mat img, @ByVal Point pt1, @ByVal Point pt2 ) { super((Pointer)null); allocate(img, pt1, pt2); }
    private native void allocate( @Const @ByRef Mat img, @ByVal Point pt1, @ByVal Point pt2 );
    /** \brief returns pointer to the current pixel
    */
    public native @Cast("uchar*") @Name("operator *") BytePointer multiply();
    /** \brief prefix increment operator (++it). shifts iterator to the next pixel
    */
    public native @ByRef @Name("operator ++") LineIterator increment();
    /** \brief postfix increment operator (it++). shifts iterator to the next pixel
    */
    public native @ByVal @Name("operator ++") LineIterator increment(int arg0);
    /** \brief returns coordinates of the current pixel
    */
    public native @ByVal Point pos();

    public native @Cast("uchar*") BytePointer ptr(); public native LineIterator ptr(BytePointer setter);
    public native @Cast("const uchar*") BytePointer ptr0(); public native LineIterator ptr0(BytePointer setter);
    public native int step(); public native LineIterator step(int setter);
    public native int elemSize(); public native LineIterator elemSize(int setter);
    public native int err(); public native LineIterator err(int setter);
    public native int count(); public native LineIterator count(int setter);
    public native int minusDelta(); public native LineIterator minusDelta(int setter);
    public native int plusDelta(); public native LineIterator plusDelta(int setter);
    public native int minusStep(); public native LineIterator minusStep(int setter);
    public native int plusStep(); public native LineIterator plusStep(int setter);
}
