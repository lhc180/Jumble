/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.morlunk.jumble.audio.speex;

public class Speex implements SpeexConstants {
  public static SWIGTYPE_p_void speex_encoder_init(SpeexMode mode) {
    long cPtr = SpeexJNI.speex_encoder_init(SpeexMode.getCPtr(mode), mode);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static void speex_encoder_destroy(SWIGTYPE_p_void state) {
    SpeexJNI.speex_encoder_destroy(SWIGTYPE_p_void.getCPtr(state));
  }

  public static int speex_encode(SWIGTYPE_p_void state, float[] in, SpeexBits bits) {
    return SpeexJNI.speex_encode(SWIGTYPE_p_void.getCPtr(state), in, SpeexBits.getCPtr(bits), bits);
  }

  public static int speex_encode_int(SWIGTYPE_p_void state, short[] in, SpeexBits bits) {
    return SpeexJNI.speex_encode_int(SWIGTYPE_p_void.getCPtr(state), in, SpeexBits.getCPtr(bits), bits);
  }

  public static int speex_encoder_ctl(SWIGTYPE_p_void state, int request, int[] ptr) {
    return SpeexJNI.speex_encoder_ctl(SWIGTYPE_p_void.getCPtr(state), request, ptr);
  }

  public static SWIGTYPE_p_void speex_decoder_init(SpeexMode mode) {
    long cPtr = SpeexJNI.speex_decoder_init(SpeexMode.getCPtr(mode), mode);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static void speex_decoder_destroy(SWIGTYPE_p_void state) {
    SpeexJNI.speex_decoder_destroy(SWIGTYPE_p_void.getCPtr(state));
  }

  public static int speex_decode(SWIGTYPE_p_void state, SpeexBits bits, float[] out) {
    return SpeexJNI.speex_decode(SWIGTYPE_p_void.getCPtr(state), SpeexBits.getCPtr(bits), bits, out);
  }

  public static int speex_decode_int(SWIGTYPE_p_void state, SpeexBits bits, short[] out) {
    return SpeexJNI.speex_decode_int(SWIGTYPE_p_void.getCPtr(state), SpeexBits.getCPtr(bits), bits, out);
  }

  public static int speex_decoder_ctl(SWIGTYPE_p_void state, int request, int[] ptr) {
    return SpeexJNI.speex_decoder_ctl(SWIGTYPE_p_void.getCPtr(state), request, ptr);
  }

  public static int speex_mode_query(SpeexMode mode, int request, int[] ptr) {
    return SpeexJNI.speex_mode_query(SpeexMode.getCPtr(mode), mode, request, ptr);
  }

  public static int speex_lib_ctl(int request, int[] ptr) {
    return SpeexJNI.speex_lib_ctl(request, ptr);
  }

  public static SpeexMode getSpeex_nb_mode() {
    long cPtr = SpeexJNI.speex_nb_mode_get();
    return (cPtr == 0) ? null : new SpeexMode(cPtr, false);
  }

  public static SpeexMode getSpeex_wb_mode() {
    long cPtr = SpeexJNI.speex_wb_mode_get();
    return (cPtr == 0) ? null : new SpeexMode(cPtr, false);
  }

  public static SpeexMode getSpeex_uwb_mode() {
    long cPtr = SpeexJNI.speex_uwb_mode_get();
    return (cPtr == 0) ? null : new SpeexMode(cPtr, false);
  }

  public static SWIGTYPE_p_p_SpeexMode getSpeex_mode_list() {
    long cPtr = SpeexJNI.speex_mode_list_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_SpeexMode(cPtr, false);
  }

  public static SpeexMode speex_lib_get_mode(int mode) {
    long cPtr = SpeexJNI.speex_lib_get_mode(mode);
    return (cPtr == 0) ? null : new SpeexMode(cPtr, false);
  }

  public static void speex_bits_init(SpeexBits bits) {
    SpeexJNI.speex_bits_init(SpeexBits.getCPtr(bits), bits);
  }

  public static void speex_bits_init_buffer(SpeexBits bits, SWIGTYPE_p_void buff, int buf_size) {
    SpeexJNI.speex_bits_init_buffer(SpeexBits.getCPtr(bits), bits, SWIGTYPE_p_void.getCPtr(buff), buf_size);
  }

  public static void speex_bits_set_bit_buffer(SpeexBits bits, SWIGTYPE_p_void buff, int buf_size) {
    SpeexJNI.speex_bits_set_bit_buffer(SpeexBits.getCPtr(bits), bits, SWIGTYPE_p_void.getCPtr(buff), buf_size);
  }

  public static void speex_bits_destroy(SpeexBits bits) {
    SpeexJNI.speex_bits_destroy(SpeexBits.getCPtr(bits), bits);
  }

  public static void speex_bits_reset(SpeexBits bits) {
    SpeexJNI.speex_bits_reset(SpeexBits.getCPtr(bits), bits);
  }

  public static void speex_bits_rewind(SpeexBits bits) {
    SpeexJNI.speex_bits_rewind(SpeexBits.getCPtr(bits), bits);
  }

  public static void speex_bits_read_from(SpeexBits bits, byte[] bytes, int len) {
    SpeexJNI.speex_bits_read_from(SpeexBits.getCPtr(bits), bits, bytes, len);
  }

  public static void speex_bits_read_whole_bytes(SpeexBits bits, byte[] bytes, int len) {
    SpeexJNI.speex_bits_read_whole_bytes(SpeexBits.getCPtr(bits), bits, bytes, len);
  }

  public static int speex_bits_write(SpeexBits bits, byte[] bytes, int max_len) {
    return SpeexJNI.speex_bits_write(SpeexBits.getCPtr(bits), bits, bytes, max_len);
  }

  public static int speex_bits_write_whole_bytes(SpeexBits bits, byte[] bytes, int max_len) {
    return SpeexJNI.speex_bits_write_whole_bytes(SpeexBits.getCPtr(bits), bits, bytes, max_len);
  }

  public static void speex_bits_pack(SpeexBits bits, int data, int nbBits) {
    SpeexJNI.speex_bits_pack(SpeexBits.getCPtr(bits), bits, data, nbBits);
  }

  public static int speex_bits_unpack_signed(SpeexBits bits, int nbBits) {
    return SpeexJNI.speex_bits_unpack_signed(SpeexBits.getCPtr(bits), bits, nbBits);
  }

  public static long speex_bits_unpack_unsigned(SpeexBits bits, int nbBits) {
    return SpeexJNI.speex_bits_unpack_unsigned(SpeexBits.getCPtr(bits), bits, nbBits);
  }

  public static int speex_bits_nbytes(SpeexBits bits) {
    return SpeexJNI.speex_bits_nbytes(SpeexBits.getCPtr(bits), bits);
  }

  public static long speex_bits_peek_unsigned(SpeexBits bits, int nbBits) {
    return SpeexJNI.speex_bits_peek_unsigned(SpeexBits.getCPtr(bits), bits, nbBits);
  }

  public static int speex_bits_peek(SpeexBits bits) {
    return SpeexJNI.speex_bits_peek(SpeexBits.getCPtr(bits), bits);
  }

  public static void speex_bits_advance(SpeexBits bits, int n) {
    SpeexJNI.speex_bits_advance(SpeexBits.getCPtr(bits), bits, n);
  }

  public static int speex_bits_remaining(SpeexBits bits) {
    return SpeexJNI.speex_bits_remaining(SpeexBits.getCPtr(bits), bits);
  }

  public static void speex_bits_insert_terminator(SpeexBits bits) {
    SpeexJNI.speex_bits_insert_terminator(SpeexBits.getCPtr(bits), bits);
  }

  public static SWIGTYPE_p_JitterBuffer_ jitter_buffer_init(int step_size) {
    long cPtr = SpeexJNI.jitter_buffer_init(step_size);
    return (cPtr == 0) ? null : new SWIGTYPE_p_JitterBuffer_(cPtr, false);
  }

  public static void jitter_buffer_reset(SWIGTYPE_p_JitterBuffer_ jitter) {
    SpeexJNI.jitter_buffer_reset(SWIGTYPE_p_JitterBuffer_.getCPtr(jitter));
  }

  public static void jitter_buffer_destroy(SWIGTYPE_p_JitterBuffer_ jitter) {
    SpeexJNI.jitter_buffer_destroy(SWIGTYPE_p_JitterBuffer_.getCPtr(jitter));
  }

  public static void jitter_buffer_put(SWIGTYPE_p_JitterBuffer_ jitter, JitterBufferPacket packet) {
    SpeexJNI.jitter_buffer_put(SWIGTYPE_p_JitterBuffer_.getCPtr(jitter), JitterBufferPacket.getCPtr(packet), packet);
  }

  public static int jitter_buffer_get(SWIGTYPE_p_JitterBuffer_ jitter, JitterBufferPacket packet, int desired_span, int[] start_offset) {
    return SpeexJNI.jitter_buffer_get(SWIGTYPE_p_JitterBuffer_.getCPtr(jitter), JitterBufferPacket.getCPtr(packet), packet, desired_span, start_offset);
  }

  public static int jitter_buffer_get_another(SWIGTYPE_p_JitterBuffer_ jitter, JitterBufferPacket packet) {
    return SpeexJNI.jitter_buffer_get_another(SWIGTYPE_p_JitterBuffer_.getCPtr(jitter), JitterBufferPacket.getCPtr(packet), packet);
  }

  public static int jitter_buffer_get_pointer_timestamp(SWIGTYPE_p_JitterBuffer_ jitter) {
    return SpeexJNI.jitter_buffer_get_pointer_timestamp(SWIGTYPE_p_JitterBuffer_.getCPtr(jitter));
  }

  public static void jitter_buffer_tick(SWIGTYPE_p_JitterBuffer_ jitter) {
    SpeexJNI.jitter_buffer_tick(SWIGTYPE_p_JitterBuffer_.getCPtr(jitter));
  }

  public static void jitter_buffer_remaining_span(SWIGTYPE_p_JitterBuffer_ jitter, long rem) {
    SpeexJNI.jitter_buffer_remaining_span(SWIGTYPE_p_JitterBuffer_.getCPtr(jitter), rem);
  }

  public static int jitter_buffer_ctl(SWIGTYPE_p_JitterBuffer_ jitter, int request, int[] ptr) {
    return SpeexJNI.jitter_buffer_ctl(SWIGTYPE_p_JitterBuffer_.getCPtr(jitter), request, ptr);
  }

  public static int jitter_buffer_update_delay(SWIGTYPE_p_JitterBuffer_ jitter, JitterBufferPacket packet, int[] start_offset) {
    return SpeexJNI.jitter_buffer_update_delay(SWIGTYPE_p_JitterBuffer_.getCPtr(jitter), JitterBufferPacket.getCPtr(packet), packet, start_offset);
  }

  public static SWIGTYPE_p_SpeexEchoState_ speex_echo_state_init(int frame_size, int filter_length) {
    long cPtr = SpeexJNI.speex_echo_state_init(frame_size, filter_length);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SpeexEchoState_(cPtr, false);
  }

  public static SWIGTYPE_p_SpeexEchoState_ speex_echo_state_init_mc(int frame_size, int filter_length, int nb_mic, int nb_speakers) {
    long cPtr = SpeexJNI.speex_echo_state_init_mc(frame_size, filter_length, nb_mic, nb_speakers);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SpeexEchoState_(cPtr, false);
  }

  public static void speex_echo_state_destroy(SWIGTYPE_p_SpeexEchoState_ st) {
    SpeexJNI.speex_echo_state_destroy(SWIGTYPE_p_SpeexEchoState_.getCPtr(st));
  }

  public static void speex_echo_cancellation(SWIGTYPE_p_SpeexEchoState_ st, short[] rec, short[] play, short[] out) {
    SpeexJNI.speex_echo_cancellation(SWIGTYPE_p_SpeexEchoState_.getCPtr(st), rec, play, out);
  }

  public static void speex_echo_cancel(SWIGTYPE_p_SpeexEchoState_ st, short[] rec, short[] play, short[] out, int[] Yout) {
    SpeexJNI.speex_echo_cancel(SWIGTYPE_p_SpeexEchoState_.getCPtr(st), rec, play, out, Yout);
  }

  public static void speex_echo_capture(SWIGTYPE_p_SpeexEchoState_ st, short[] rec, short[] out) {
    SpeexJNI.speex_echo_capture(SWIGTYPE_p_SpeexEchoState_.getCPtr(st), rec, out);
  }

  public static void speex_echo_playback(SWIGTYPE_p_SpeexEchoState_ st, short[] play) {
    SpeexJNI.speex_echo_playback(SWIGTYPE_p_SpeexEchoState_.getCPtr(st), play);
  }

  public static void speex_echo_state_reset(SWIGTYPE_p_SpeexEchoState_ st) {
    SpeexJNI.speex_echo_state_reset(SWIGTYPE_p_SpeexEchoState_.getCPtr(st));
  }

  public static int speex_echo_ctl(SWIGTYPE_p_SpeexEchoState_ st, int request, int[] ptr) {
    return SpeexJNI.speex_echo_ctl(SWIGTYPE_p_SpeexEchoState_.getCPtr(st), request, ptr);
  }

  public static SWIGTYPE_p_SpeexDecorrState_ speex_decorrelate_new(int rate, int channels, int frame_size) {
    long cPtr = SpeexJNI.speex_decorrelate_new(rate, channels, frame_size);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SpeexDecorrState_(cPtr, false);
  }

  public static void speex_decorrelate(SWIGTYPE_p_SpeexDecorrState_ st, short[] in, short[] out, int strength) {
    SpeexJNI.speex_decorrelate(SWIGTYPE_p_SpeexDecorrState_.getCPtr(st), in, out, strength);
  }

  public static void speex_decorrelate_destroy(SWIGTYPE_p_SpeexDecorrState_ st) {
    SpeexJNI.speex_decorrelate_destroy(SWIGTYPE_p_SpeexDecorrState_.getCPtr(st));
  }

  public static SWIGTYPE_p_SpeexResamplerState_ speex_resampler_init(long nb_channels, long in_rate, long out_rate, int quality, int[] err) {
    long cPtr = SpeexJNI.speex_resampler_init(nb_channels, in_rate, out_rate, quality, err);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SpeexResamplerState_(cPtr, false);
  }

  public static SWIGTYPE_p_SpeexResamplerState_ speex_resampler_init_frac(long nb_channels, long ratio_num, long ratio_den, long in_rate, long out_rate, int quality, int[] err) {
    long cPtr = SpeexJNI.speex_resampler_init_frac(nb_channels, ratio_num, ratio_den, in_rate, out_rate, quality, err);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SpeexResamplerState_(cPtr, false);
  }

  public static void speex_resampler_destroy(SWIGTYPE_p_SpeexResamplerState_ st) {
    SpeexJNI.speex_resampler_destroy(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st));
  }

  public static int speex_resampler_process_float(SWIGTYPE_p_SpeexResamplerState_ st, long channel_index, float[] in, int[] in_len, float[] out, int[] out_len) {
    return SpeexJNI.speex_resampler_process_float(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), channel_index, in, in_len, out, out_len);
  }

  public static int speex_resampler_process_int(SWIGTYPE_p_SpeexResamplerState_ st, long channel_index, short[] in, int[] in_len, short[] out, int[] out_len) {
    return SpeexJNI.speex_resampler_process_int(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), channel_index, in, in_len, out, out_len);
  }

  public static int speex_resampler_process_interleaved_float(SWIGTYPE_p_SpeexResamplerState_ st, float[] in, int[] in_len, float[] out, int[] out_len) {
    return SpeexJNI.speex_resampler_process_interleaved_float(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), in, in_len, out, out_len);
  }

  public static int speex_resampler_process_interleaved_int(SWIGTYPE_p_SpeexResamplerState_ st, short[] in, int[] in_len, short[] out, int[] out_len) {
    return SpeexJNI.speex_resampler_process_interleaved_int(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), in, in_len, out, out_len);
  }

  public static int speex_resampler_set_rate(SWIGTYPE_p_SpeexResamplerState_ st, long in_rate, long out_rate) {
    return SpeexJNI.speex_resampler_set_rate(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), in_rate, out_rate);
  }

  public static void speex_resampler_get_rate(SWIGTYPE_p_SpeexResamplerState_ st, int[] in_rate, int[] out_rate) {
    SpeexJNI.speex_resampler_get_rate(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), in_rate, out_rate);
  }

  public static int speex_resampler_set_rate_frac(SWIGTYPE_p_SpeexResamplerState_ st, long ratio_num, long ratio_den, long in_rate, long out_rate) {
    return SpeexJNI.speex_resampler_set_rate_frac(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), ratio_num, ratio_den, in_rate, out_rate);
  }

  public static void speex_resampler_get_ratio(SWIGTYPE_p_SpeexResamplerState_ st, int[] ratio_num, int[] ratio_den) {
    SpeexJNI.speex_resampler_get_ratio(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), ratio_num, ratio_den);
  }

  public static int speex_resampler_set_quality(SWIGTYPE_p_SpeexResamplerState_ st, int quality) {
    return SpeexJNI.speex_resampler_set_quality(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), quality);
  }

  public static void speex_resampler_get_quality(SWIGTYPE_p_SpeexResamplerState_ st, int[] quality) {
    SpeexJNI.speex_resampler_get_quality(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), quality);
  }

  public static void speex_resampler_set_input_stride(SWIGTYPE_p_SpeexResamplerState_ st, long stride) {
    SpeexJNI.speex_resampler_set_input_stride(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), stride);
  }

  public static void speex_resampler_get_input_stride(SWIGTYPE_p_SpeexResamplerState_ st, int[] stride) {
    SpeexJNI.speex_resampler_get_input_stride(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), stride);
  }

  public static void speex_resampler_set_output_stride(SWIGTYPE_p_SpeexResamplerState_ st, long stride) {
    SpeexJNI.speex_resampler_set_output_stride(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), stride);
  }

  public static void speex_resampler_get_output_stride(SWIGTYPE_p_SpeexResamplerState_ st, int[] stride) {
    SpeexJNI.speex_resampler_get_output_stride(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st), stride);
  }

  public static int speex_resampler_get_input_latency(SWIGTYPE_p_SpeexResamplerState_ st) {
    return SpeexJNI.speex_resampler_get_input_latency(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st));
  }

  public static int speex_resampler_get_output_latency(SWIGTYPE_p_SpeexResamplerState_ st) {
    return SpeexJNI.speex_resampler_get_output_latency(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st));
  }

  public static int speex_resampler_skip_zeros(SWIGTYPE_p_SpeexResamplerState_ st) {
    return SpeexJNI.speex_resampler_skip_zeros(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st));
  }

  public static int speex_resampler_reset_mem(SWIGTYPE_p_SpeexResamplerState_ st) {
    return SpeexJNI.speex_resampler_reset_mem(SWIGTYPE_p_SpeexResamplerState_.getCPtr(st));
  }

  public static byte[] speex_resampler_strerror(int err) {
    return SpeexJNI.speex_resampler_strerror(err);
  }

}
