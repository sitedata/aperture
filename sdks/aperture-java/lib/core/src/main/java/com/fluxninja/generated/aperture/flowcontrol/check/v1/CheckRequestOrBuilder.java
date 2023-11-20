// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aperture/flowcontrol/check/v1/check.proto

package com.fluxninja.generated.aperture.flowcontrol.check.v1;

public interface CheckRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aperture.flowcontrol.check.v1.CheckRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string control_point = 1 [json_name = "controlPoint"];</code>
   * @return The controlPoint.
   */
  java.lang.String getControlPoint();
  /**
   * <code>string control_point = 1 [json_name = "controlPoint"];</code>
   * @return The bytes for controlPoint.
   */
  com.google.protobuf.ByteString
      getControlPointBytes();

  /**
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  int getLabelsCount();
  /**
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <code>bool ramp_mode = 3 [json_name = "rampMode"];</code>
   * @return The rampMode.
   */
  boolean getRampMode();

  /**
   * <pre>
   * Cache item to fetch.
   * </pre>
   *
   * <code>string cache_key = 4 [json_name = "cacheKey"];</code>
   * @return The cacheKey.
   */
  java.lang.String getCacheKey();
  /**
   * <pre>
   * Cache item to fetch.
   * </pre>
   *
   * <code>string cache_key = 4 [json_name = "cacheKey"];</code>
   * @return The bytes for cacheKey.
   */
  com.google.protobuf.ByteString
      getCacheKeyBytes();
}
