// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Greedily selects a subset of bounding boxes in descending order of score,
 * 
 *  This operation performs non_max_suppression on the inputs per batch, across
 *  all classes.
 *  Prunes away boxes that have high intersection-over-union (IOU) overlap
 *  with previously selected boxes.  Bounding boxes are supplied as
 *  [y1, x1, y2, x2], where (y1, x1) and (y2, x2) are the coordinates of any
 *  diagonal pair of box corners and the coordinates can be provided as normalized
 *  (i.e., lying in the interval [0, 1]) or absolute.  Note that this algorithm
 *  is agnostic to where the origin is in the coordinate system. Also note that
 *  this algorithm is invariant to orthogonal transformations and translations
 *  of the coordinate system; thus translating or reflections of the coordinate
 *  system result in the same boxes being selected by the algorithm.
 *  The output of this operation is the final boxes, scores and classes tensor
 *  returned after performing non_max_suppression.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * boxes: A 4-D float tensor of shape {@code [batch_size, num_boxes, q, 4]}. If {@code q} is 1 then
 *  same boxes are used for all classes otherwise, if {@code q} is equal to number of
 *  classes, class-specific boxes are used.
 *  * scores: A 3-D float tensor of shape {@code [batch_size, num_boxes, num_classes]}
 *  representing a single score corresponding to each box (each row of boxes).
 *  * max_output_size_per_class: A scalar integer tensor representing the maximum number of
 *  boxes to be selected by non max suppression per class
 *  * max_total_size: A scalar representing maximum number of boxes retained over all classes.
 *  * iou_threshold: A 0-D float tensor representing the threshold for deciding whether
 *  boxes overlap too much with respect to IOU.
 *  * score_threshold: A 0-D float tensor representing the threshold for deciding when to remove
 *  boxes based on score.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * pad_per_class: If false, the output nmsed boxes, scores and classes
 *  are padded/clipped to {@code max_total_size}. If true, the
 *  output nmsed boxes, scores and classes are padded to be of length
 *  {@code max_size_per_class}*{@code num_classes}, unless it exceeds {@code max_total_size} in
 *  which case it is clipped to {@code max_total_size}. Defaults to false.
 *  * clip_boxes: If true, assume the box coordinates are between [0, 1] and clip the output boxes
 *  if they fall beyond [0, 1]. If false, do not do clipping and output the box
 *  coordinates as it is.
 * 
 *  Returns:
 *  * {@code Output} nmsed_boxes: A [batch_size, max_detections, 4] float32 tensor
 *  containing the non-max suppressed boxes.
 *  * {@code Output} nmsed_scores: A [batch_size, max_detections] float32 tensor
 *  containing the scores for the boxes.
 *  * {@code Output} nmsed_classes: A [batch_size, max_detections] float32 tensor
 *  containing the classes for the boxes.
 *  * {@code Output} valid_detections: A [batch_size] int32 tensor indicating the number of
 *  valid detections per batch item. Only the top num_detections[i] entries in
 *  nms_boxes[i], nms_scores[i] and nms_class[i] are valid. The rest of the
 *  entries are zero paddings. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CombinedNonMaxSuppression extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CombinedNonMaxSuppression(Pointer p) { super(p); }

  /** Optional attribute setters for CombinedNonMaxSuppression */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** If false, the output nmsed boxes, scores and classes
     *  are padded/clipped to {@code max_total_size}. If true, the
     *  output nmsed boxes, scores and classes are padded to be of length
     *  {@code max_size_per_class}*{@code num_classes}, unless it exceeds {@code max_total_size} in
     *  which case it is clipped to {@code max_total_size}. Defaults to false.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs PadPerClass(@Cast("bool") boolean x);

    /** If true, assume the box coordinates are between [0, 1] and clip the output boxes
     *  if they fall beyond [0, 1]. If false, do not do clipping and output the box
     *  coordinates as it is.
     * 
     *  Defaults to true */
    public native @ByVal Attrs ClipBoxes(@Cast("bool") boolean x);

    public native @Cast("bool") boolean pad_per_class_(); public native Attrs pad_per_class_(boolean setter);
    public native @Cast("bool") boolean clip_boxes_(); public native Attrs clip_boxes_(boolean setter);
  }
  public CombinedNonMaxSuppression(@Const @ByRef Scope scope, @ByVal Input boxes, @ByVal Input scores,
                            @ByVal Input max_output_size_per_class,
                            @ByVal Input max_total_size,
                            @ByVal Input iou_threshold,
                            @ByVal Input score_threshold) { super((Pointer)null); allocate(scope, boxes, scores, max_output_size_per_class, max_total_size, iou_threshold, score_threshold); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input boxes, @ByVal Input scores,
                            @ByVal Input max_output_size_per_class,
                            @ByVal Input max_total_size,
                            @ByVal Input iou_threshold,
                            @ByVal Input score_threshold);
  public CombinedNonMaxSuppression(@Const @ByRef Scope scope, @ByVal Input boxes, @ByVal Input scores,
                            @ByVal Input max_output_size_per_class,
                            @ByVal Input max_total_size,
                            @ByVal Input iou_threshold,
                            @ByVal Input score_threshold, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, boxes, scores, max_output_size_per_class, max_total_size, iou_threshold, score_threshold, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input boxes, @ByVal Input scores,
                            @ByVal Input max_output_size_per_class,
                            @ByVal Input max_total_size,
                            @ByVal Input iou_threshold,
                            @ByVal Input score_threshold, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs PadPerClass(@Cast("bool") boolean x);
  public static native @ByVal Attrs ClipBoxes(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native CombinedNonMaxSuppression operation(Operation setter);
  public native @ByRef Output nmsed_boxes(); public native CombinedNonMaxSuppression nmsed_boxes(Output setter);
  public native @ByRef Output nmsed_scores(); public native CombinedNonMaxSuppression nmsed_scores(Output setter);
  public native @ByRef Output nmsed_classes(); public native CombinedNonMaxSuppression nmsed_classes(Output setter);
  public native @ByRef Output valid_detections(); public native CombinedNonMaxSuppression valid_detections(Output setter);
}
