// Code generated by protoc-gen-go-json. DO NOT EDIT.
// source: aperture/policy/sync/v1/concurrency_scheduler.proto

package syncv1

import (
	"google.golang.org/protobuf/encoding/protojson"
)

// MarshalJSON implements json.Marshaler
func (msg *ConcurrencySchedulerWrapper) MarshalJSON() ([]byte, error) {
	return protojson.MarshalOptions{
		UseEnumNumbers:  false,
		EmitUnpopulated: true,
		UseProtoNames:   true,
	}.Marshal(msg)
}

// UnmarshalJSON implements json.Unmarshaler
func (msg *ConcurrencySchedulerWrapper) UnmarshalJSON(b []byte) error {
	return protojson.UnmarshalOptions{
		DiscardUnknown: true,
	}.Unmarshal(b, msg)
}
