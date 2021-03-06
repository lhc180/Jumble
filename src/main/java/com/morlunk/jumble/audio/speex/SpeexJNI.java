/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.morlunk.jumble.audio.speex;

public class SpeexJNI {

  static {
      System.loadLibrary("speex");
  }

  public final static native int SPEEX_SET_ENH_get();
  public final static native int SPEEX_GET_ENH_get();
  public final static native int SPEEX_GET_FRAME_SIZE_get();
  public final static native int SPEEX_SET_QUALITY_get();
  public final static native int SPEEX_SET_MODE_get();
  public final static native int SPEEX_GET_MODE_get();
  public final static native int SPEEX_SET_LOW_MODE_get();
  public final static native int SPEEX_GET_LOW_MODE_get();
  public final static native int SPEEX_SET_HIGH_MODE_get();
  public final static native int SPEEX_GET_HIGH_MODE_get();
  public final static native int SPEEX_SET_VBR_get();
  public final static native int SPEEX_GET_VBR_get();
  public final static native int SPEEX_SET_VBR_QUALITY_get();
  public final static native int SPEEX_GET_VBR_QUALITY_get();
  public final static native int SPEEX_SET_COMPLEXITY_get();
  public final static native int SPEEX_GET_COMPLEXITY_get();
  public final static native int SPEEX_SET_BITRATE_get();
  public final static native int SPEEX_GET_BITRATE_get();
  public final static native int SPEEX_SET_HANDLER_get();
  public final static native int SPEEX_SET_USER_HANDLER_get();
  public final static native int SPEEX_SET_SAMPLING_RATE_get();
  public final static native int SPEEX_GET_SAMPLING_RATE_get();
  public final static native int SPEEX_RESET_STATE_get();
  public final static native int SPEEX_GET_RELATIVE_QUALITY_get();
  public final static native int SPEEX_SET_VAD_get();
  public final static native int SPEEX_GET_VAD_get();
  public final static native int SPEEX_SET_ABR_get();
  public final static native int SPEEX_GET_ABR_get();
  public final static native int SPEEX_SET_DTX_get();
  public final static native int SPEEX_GET_DTX_get();
  public final static native int SPEEX_SET_SUBMODE_ENCODING_get();
  public final static native int SPEEX_GET_SUBMODE_ENCODING_get();
  public final static native int SPEEX_GET_LOOKAHEAD_get();
  public final static native int SPEEX_SET_PLC_TUNING_get();
  public final static native int SPEEX_GET_PLC_TUNING_get();
  public final static native int SPEEX_SET_VBR_MAX_BITRATE_get();
  public final static native int SPEEX_GET_VBR_MAX_BITRATE_get();
  public final static native int SPEEX_SET_HIGHPASS_get();
  public final static native int SPEEX_GET_HIGHPASS_get();
  public final static native int SPEEX_GET_ACTIVITY_get();
  public final static native int SPEEX_SET_PF_get();
  public final static native int SPEEX_GET_PF_get();
  public final static native int SPEEX_MODE_FRAME_SIZE_get();
  public final static native int SPEEX_SUBMODE_BITS_PER_FRAME_get();
  public final static native int SPEEX_LIB_GET_MAJOR_VERSION_get();
  public final static native int SPEEX_LIB_GET_MINOR_VERSION_get();
  public final static native int SPEEX_LIB_GET_MICRO_VERSION_get();
  public final static native int SPEEX_LIB_GET_EXTRA_VERSION_get();
  public final static native int SPEEX_LIB_GET_VERSION_STRING_get();
  public final static native int SPEEX_NB_MODES_get();
  public final static native int SPEEX_MODEID_NB_get();
  public final static native int SPEEX_MODEID_WB_get();
  public final static native int SPEEX_MODEID_UWB_get();
  public final static native void SpeexMode_mode_set(long jarg1, SpeexMode jarg1_, long jarg2);
  public final static native long SpeexMode_mode_get(long jarg1, SpeexMode jarg1_);
  public final static native void SpeexMode_query_set(long jarg1, SpeexMode jarg1_, long jarg2);
  public final static native long SpeexMode_query_get(long jarg1, SpeexMode jarg1_);
  public final static native void SpeexMode_modeName_set(long jarg1, SpeexMode jarg1_, byte[] jarg2);
  public final static native byte[] SpeexMode_modeName_get(long jarg1, SpeexMode jarg1_);
  public final static native void SpeexMode_modeID_set(long jarg1, SpeexMode jarg1_, int jarg2);
  public final static native int SpeexMode_modeID_get(long jarg1, SpeexMode jarg1_);
  public final static native void SpeexMode_bitstream_version_set(long jarg1, SpeexMode jarg1_, int jarg2);
  public final static native int SpeexMode_bitstream_version_get(long jarg1, SpeexMode jarg1_);
  public final static native void SpeexMode_enc_init_set(long jarg1, SpeexMode jarg1_, long jarg2);
  public final static native long SpeexMode_enc_init_get(long jarg1, SpeexMode jarg1_);
  public final static native void SpeexMode_enc_destroy_set(long jarg1, SpeexMode jarg1_, long jarg2);
  public final static native long SpeexMode_enc_destroy_get(long jarg1, SpeexMode jarg1_);
  public final static native void SpeexMode_enc_set(long jarg1, SpeexMode jarg1_, long jarg2);
  public final static native long SpeexMode_enc_get(long jarg1, SpeexMode jarg1_);
  public final static native void SpeexMode_dec_init_set(long jarg1, SpeexMode jarg1_, long jarg2);
  public final static native long SpeexMode_dec_init_get(long jarg1, SpeexMode jarg1_);
  public final static native void SpeexMode_dec_destroy_set(long jarg1, SpeexMode jarg1_, long jarg2);
  public final static native long SpeexMode_dec_destroy_get(long jarg1, SpeexMode jarg1_);
  public final static native void SpeexMode_dec_set(long jarg1, SpeexMode jarg1_, long jarg2);
  public final static native long SpeexMode_dec_get(long jarg1, SpeexMode jarg1_);
  public final static native void SpeexMode_enc_ctl_set(long jarg1, SpeexMode jarg1_, long jarg2);
  public final static native long SpeexMode_enc_ctl_get(long jarg1, SpeexMode jarg1_);
  public final static native void SpeexMode_dec_ctl_set(long jarg1, SpeexMode jarg1_, long jarg2);
  public final static native long SpeexMode_dec_ctl_get(long jarg1, SpeexMode jarg1_);
  public final static native long new_SpeexMode();
  public final static native void delete_SpeexMode(long jarg1);
  public final static native long speex_encoder_init(long jarg1, SpeexMode jarg1_);
  public final static native void speex_encoder_destroy(long jarg1);
  public final static native int speex_encode(long jarg1, float[] jarg2, long jarg3, SpeexBits jarg3_);
  public final static native int speex_encode_int(long jarg1, short[] jarg2, long jarg3, SpeexBits jarg3_);
  public final static native int speex_encoder_ctl(long jarg1, int jarg2, int[] jarg3);
  public final static native long speex_decoder_init(long jarg1, SpeexMode jarg1_);
  public final static native void speex_decoder_destroy(long jarg1);
  public final static native int speex_decode(long jarg1, long jarg2, SpeexBits jarg2_, float[] jarg3);
  public final static native int speex_decode_int(long jarg1, long jarg2, SpeexBits jarg2_, short[] jarg3);
  public final static native int speex_decoder_ctl(long jarg1, int jarg2, int[] jarg3);
  public final static native int speex_mode_query(long jarg1, SpeexMode jarg1_, int jarg2, int[] jarg3);
  public final static native int speex_lib_ctl(int jarg1, int[] jarg2);
  public final static native long speex_nb_mode_get();
  public final static native long speex_wb_mode_get();
  public final static native long speex_uwb_mode_get();
  public final static native long speex_mode_list_get();
  public final static native long speex_lib_get_mode(int jarg1);
  public final static native void SpeexBits_chars_set(long jarg1, SpeexBits jarg1_, byte[] jarg2);
  public final static native byte[] SpeexBits_chars_get(long jarg1, SpeexBits jarg1_);
  public final static native void SpeexBits_nbBits_set(long jarg1, SpeexBits jarg1_, int jarg2);
  public final static native int SpeexBits_nbBits_get(long jarg1, SpeexBits jarg1_);
  public final static native void SpeexBits_charPtr_set(long jarg1, SpeexBits jarg1_, int jarg2);
  public final static native int SpeexBits_charPtr_get(long jarg1, SpeexBits jarg1_);
  public final static native void SpeexBits_bitPtr_set(long jarg1, SpeexBits jarg1_, int jarg2);
  public final static native int SpeexBits_bitPtr_get(long jarg1, SpeexBits jarg1_);
  public final static native void SpeexBits_owner_set(long jarg1, SpeexBits jarg1_, int jarg2);
  public final static native int SpeexBits_owner_get(long jarg1, SpeexBits jarg1_);
  public final static native void SpeexBits_overflow_set(long jarg1, SpeexBits jarg1_, int jarg2);
  public final static native int SpeexBits_overflow_get(long jarg1, SpeexBits jarg1_);
  public final static native void SpeexBits_buf_size_set(long jarg1, SpeexBits jarg1_, int jarg2);
  public final static native int SpeexBits_buf_size_get(long jarg1, SpeexBits jarg1_);
  public final static native void SpeexBits_reserved1_set(long jarg1, SpeexBits jarg1_, int jarg2);
  public final static native int SpeexBits_reserved1_get(long jarg1, SpeexBits jarg1_);
  public final static native void SpeexBits_reserved2_set(long jarg1, SpeexBits jarg1_, long jarg2);
  public final static native long SpeexBits_reserved2_get(long jarg1, SpeexBits jarg1_);
  public final static native long new_SpeexBits();
  public final static native void delete_SpeexBits(long jarg1);
  public final static native void speex_bits_init(long jarg1, SpeexBits jarg1_);
  public final static native void speex_bits_init_buffer(long jarg1, SpeexBits jarg1_, long jarg2, int jarg3);
  public final static native void speex_bits_set_bit_buffer(long jarg1, SpeexBits jarg1_, long jarg2, int jarg3);
  public final static native void speex_bits_destroy(long jarg1, SpeexBits jarg1_);
  public final static native void speex_bits_reset(long jarg1, SpeexBits jarg1_);
  public final static native void speex_bits_rewind(long jarg1, SpeexBits jarg1_);
  public final static native void speex_bits_read_from(long jarg1, SpeexBits jarg1_, byte[] jarg2, int jarg3);
  public final static native void speex_bits_read_whole_bytes(long jarg1, SpeexBits jarg1_, byte[] jarg2, int jarg3);
  public final static native int speex_bits_write(long jarg1, SpeexBits jarg1_, byte[] jarg2, int jarg3);
  public final static native int speex_bits_write_whole_bytes(long jarg1, SpeexBits jarg1_, byte[] jarg2, int jarg3);
  public final static native void speex_bits_pack(long jarg1, SpeexBits jarg1_, int jarg2, int jarg3);
  public final static native int speex_bits_unpack_signed(long jarg1, SpeexBits jarg1_, int jarg2);
  public final static native long speex_bits_unpack_unsigned(long jarg1, SpeexBits jarg1_, int jarg2);
  public final static native int speex_bits_nbytes(long jarg1, SpeexBits jarg1_);
  public final static native long speex_bits_peek_unsigned(long jarg1, SpeexBits jarg1_, int jarg2);
  public final static native int speex_bits_peek(long jarg1, SpeexBits jarg1_);
  public final static native void speex_bits_advance(long jarg1, SpeexBits jarg1_, int jarg2);
  public final static native int speex_bits_remaining(long jarg1, SpeexBits jarg1_);
  public final static native void speex_bits_insert_terminator(long jarg1, SpeexBits jarg1_);
  public final static native void JitterBufferPacket_data_set(long jarg1, JitterBufferPacket jarg1_, byte[] jarg2);
  public final static native byte[] JitterBufferPacket_data_get(long jarg1, JitterBufferPacket jarg1_);
  public final static native void JitterBufferPacket_len_set(long jarg1, JitterBufferPacket jarg1_, long jarg2);
  public final static native long JitterBufferPacket_len_get(long jarg1, JitterBufferPacket jarg1_);
  public final static native void JitterBufferPacket_timestamp_set(long jarg1, JitterBufferPacket jarg1_, long jarg2);
  public final static native long JitterBufferPacket_timestamp_get(long jarg1, JitterBufferPacket jarg1_);
  public final static native void JitterBufferPacket_span_set(long jarg1, JitterBufferPacket jarg1_, long jarg2);
  public final static native long JitterBufferPacket_span_get(long jarg1, JitterBufferPacket jarg1_);
  public final static native void JitterBufferPacket_sequence_set(long jarg1, JitterBufferPacket jarg1_, int jarg2);
  public final static native int JitterBufferPacket_sequence_get(long jarg1, JitterBufferPacket jarg1_);
  public final static native void JitterBufferPacket_user_data_set(long jarg1, JitterBufferPacket jarg1_, long jarg2);
  public final static native long JitterBufferPacket_user_data_get(long jarg1, JitterBufferPacket jarg1_);
  public final static native long new_JitterBufferPacket();
  public final static native void delete_JitterBufferPacket(long jarg1);
  public final static native int JITTER_BUFFER_OK_get();
  public final static native int JITTER_BUFFER_MISSING_get();
  public final static native int JITTER_BUFFER_INSERTION_get();
  public final static native int JITTER_BUFFER_INTERNAL_ERROR_get();
  public final static native int JITTER_BUFFER_BAD_ARGUMENT_get();
  public final static native int JITTER_BUFFER_SET_MARGIN_get();
  public final static native int JITTER_BUFFER_GET_MARGIN_get();
  public final static native int JITTER_BUFFER_GET_AVAILABLE_COUNT_get();
  public final static native int JITTER_BUFFER_GET_AVALIABLE_COUNT_get();
  public final static native int JITTER_BUFFER_SET_DESTROY_CALLBACK_get();
  public final static native int JITTER_BUFFER_GET_DESTROY_CALLBACK_get();
  public final static native int JITTER_BUFFER_SET_DELAY_STEP_get();
  public final static native int JITTER_BUFFER_GET_DELAY_STEP_get();
  public final static native int JITTER_BUFFER_SET_CONCEALMENT_SIZE_get();
  public final static native int JITTER_BUFFER_GET_CONCEALMENT_SIZE_get();
  public final static native int JITTER_BUFFER_SET_MAX_LATE_RATE_get();
  public final static native int JITTER_BUFFER_GET_MAX_LATE_RATE_get();
  public final static native int JITTER_BUFFER_SET_LATE_COST_get();
  public final static native int JITTER_BUFFER_GET_LATE_COST_get();
  public final static native long jitter_buffer_init(int jarg1);
  public final static native void jitter_buffer_reset(long jarg1);
  public final static native void jitter_buffer_destroy(long jarg1);
  public final static native void jitter_buffer_put(long jarg1, long jarg2, JitterBufferPacket jarg2_);
  public final static native int jitter_buffer_get(long jarg1, long jarg2, JitterBufferPacket jarg2_, int jarg3, int[] jarg4);
  public final static native int jitter_buffer_get_another(long jarg1, long jarg2, JitterBufferPacket jarg2_);
  public final static native int jitter_buffer_get_pointer_timestamp(long jarg1);
  public final static native void jitter_buffer_tick(long jarg1);
  public final static native void jitter_buffer_remaining_span(long jarg1, long jarg2);
  public final static native int jitter_buffer_ctl(long jarg1, int jarg2, int[] jarg3);
  public final static native int jitter_buffer_update_delay(long jarg1, long jarg2, JitterBufferPacket jarg2_, int[] jarg3);
  public final static native int SPEEX_ECHO_GET_FRAME_SIZE_get();
  public final static native int SPEEX_ECHO_SET_SAMPLING_RATE_get();
  public final static native int SPEEX_ECHO_GET_SAMPLING_RATE_get();
  public final static native int SPEEX_ECHO_GET_IMPULSE_RESPONSE_SIZE_get();
  public final static native int SPEEX_ECHO_GET_IMPULSE_RESPONSE_get();
  public final static native long speex_echo_state_init(int jarg1, int jarg2);
  public final static native long speex_echo_state_init_mc(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native void speex_echo_state_destroy(long jarg1);
  public final static native void speex_echo_cancellation(long jarg1, short[] jarg2, short[] jarg3, short[] jarg4);
  public final static native void speex_echo_cancel(long jarg1, short[] jarg2, short[] jarg3, short[] jarg4, int[] jarg5);
  public final static native void speex_echo_capture(long jarg1, short[] jarg2, short[] jarg3);
  public final static native void speex_echo_playback(long jarg1, short[] jarg2);
  public final static native void speex_echo_state_reset(long jarg1);
  public final static native int speex_echo_ctl(long jarg1, int jarg2, int[] jarg3);
  public final static native long speex_decorrelate_new(int jarg1, int jarg2, int jarg3);
  public final static native void speex_decorrelate(long jarg1, short[] jarg2, short[] jarg3, int jarg4);
  public final static native void speex_decorrelate_destroy(long jarg1);
  public final static native int SPEEX_RESAMPLER_QUALITY_MAX_get();
  public final static native int SPEEX_RESAMPLER_QUALITY_MIN_get();
  public final static native int SPEEX_RESAMPLER_QUALITY_DEFAULT_get();
  public final static native int SPEEX_RESAMPLER_QUALITY_VOIP_get();
  public final static native int SPEEX_RESAMPLER_QUALITY_DESKTOP_get();
  public final static native int RESAMPLER_ERR_SUCCESS_get();
  public final static native int RESAMPLER_ERR_ALLOC_FAILED_get();
  public final static native int RESAMPLER_ERR_BAD_STATE_get();
  public final static native int RESAMPLER_ERR_INVALID_ARG_get();
  public final static native int RESAMPLER_ERR_PTR_OVERLAP_get();
  public final static native int RESAMPLER_ERR_MAX_ERROR_get();
  public final static native long speex_resampler_init(long jarg1, long jarg2, long jarg3, int jarg4, int[] jarg5);
  public final static native long speex_resampler_init_frac(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5, int jarg6, int[] jarg7);
  public final static native void speex_resampler_destroy(long jarg1);
  public final static native int speex_resampler_process_float(long jarg1, long jarg2, float[] jarg3, int[] jarg4, float[] jarg5, int[] jarg6);
  public final static native int speex_resampler_process_int(long jarg1, long jarg2, short[] jarg3, int[] jarg4, short[] jarg5, int[] jarg6);
  public final static native int speex_resampler_process_interleaved_float(long jarg1, float[] jarg2, int[] jarg3, float[] jarg4, int[] jarg5);
  public final static native int speex_resampler_process_interleaved_int(long jarg1, short[] jarg2, int[] jarg3, short[] jarg4, int[] jarg5);
  public final static native int speex_resampler_set_rate(long jarg1, long jarg2, long jarg3);
  public final static native void speex_resampler_get_rate(long jarg1, int[] jarg2, int[] jarg3);
  public final static native int speex_resampler_set_rate_frac(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native void speex_resampler_get_ratio(long jarg1, int[] jarg2, int[] jarg3);
  public final static native int speex_resampler_set_quality(long jarg1, int jarg2);
  public final static native void speex_resampler_get_quality(long jarg1, int[] jarg2);
  public final static native void speex_resampler_set_input_stride(long jarg1, long jarg2);
  public final static native void speex_resampler_get_input_stride(long jarg1, int[] jarg2);
  public final static native void speex_resampler_set_output_stride(long jarg1, long jarg2);
  public final static native void speex_resampler_get_output_stride(long jarg1, int[] jarg2);
  public final static native int speex_resampler_get_input_latency(long jarg1);
  public final static native int speex_resampler_get_output_latency(long jarg1);
  public final static native int speex_resampler_skip_zeros(long jarg1);
  public final static native int speex_resampler_reset_mem(long jarg1);
  public final static native byte[] speex_resampler_strerror(int jarg1);
}
