/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.morlunk.jumble.audio.celt11;

public class CELT11Encoder {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CELT11Encoder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CELT11Encoder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CELT11JNI.delete_CELT11Encoder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CELT11Encoder() {
    this(CELT11JNI.new_CELT11Encoder(), true);
  }

}