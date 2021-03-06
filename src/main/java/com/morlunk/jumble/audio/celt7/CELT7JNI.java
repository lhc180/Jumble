/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.morlunk.jumble.audio.celt7;

public class CELT7JNI {

  static {
      System.loadLibrary("celt7");
  }

  public final static native int CELT_OK_get();
  public final static native int CELT_BAD_ARG_get();
  public final static native int CELT_INVALID_MODE_get();
  public final static native int CELT_INTERNAL_ERROR_get();
  public final static native int CELT_CORRUPTED_DATA_get();
  public final static native int CELT_UNIMPLEMENTED_get();
  public final static native int CELT_INVALID_STATE_get();
  public final static native int CELT_ALLOC_FAIL_get();
  public final static native int CELT_GET_MODE_REQUEST_get();
  public final static native int CELT_SET_COMPLEXITY_REQUEST_get();
  public final static native int CELT_SET_PREDICTION_REQUEST_get();
  public final static native int CELT_SET_VBR_RATE_REQUEST_get();
  public final static native int CELT_RESET_STATE_REQUEST_get();
  public final static native int CELT_RESET_STATE_get();
  public final static native int CELT_GET_FRAME_SIZE_get();
  public final static native int CELT_GET_LOOKAHEAD_get();
  public final static native int CELT_GET_SAMPLE_RATE_get();
  public final static native int CELT_GET_BITSTREAM_VERSION_get();
  public final static native long celt_mode_create(int jarg1, int jarg2, int[] jarg3);
  public final static native void celt_mode_destroy(long jarg1);
  public final static native int celt_mode_info(long jarg1, int jarg2, int[] jarg3);
  public final static native long celt_encoder_create(long jarg1, int jarg2, int[] jarg3);
  public final static native void celt_encoder_destroy(long jarg1);
  public final static native int celt_encode_float(long jarg1, float[] jarg2, float[] jarg3, byte[] jarg4, int jarg5);
  public final static native int celt_encode(long jarg1, short[] jarg2, short[] jarg3, byte[] jarg4, int jarg5);
  public final static native int celt_encoder_ctl(long jarg1, int jarg2, int[] jarg3);
  public final static native long celt_decoder_create(long jarg1, int jarg2, int[] jarg3);
  public final static native void celt_decoder_destroy(long jarg1);
  public final static native int celt_decode_float(long jarg1, byte[] jarg2, int jarg3, float[] jarg4);
  public final static native int celt_decode(long jarg1, byte[] jarg2, int jarg3, short[] jarg4);
  public final static native int celt_decoder_ctl(long jarg1, int jarg2);
  public final static native byte[] celt_strerror(int jarg1);
}
