// <auto-generated/>

#nullable disable

using System;
using System.ClientModel;
using System.ClientModel.Primitives;
using System.Text.Json;

namespace _Type.Property.Optional.Models
{
    public partial class PlainDateProperty : IJsonModel<PlainDateProperty>
    {
        void IJsonModel<PlainDateProperty>.Write(Utf8JsonWriter writer, ModelReaderWriterOptions options) => throw null;

        protected virtual void JsonModelWriteCore(Utf8JsonWriter writer, ModelReaderWriterOptions options) => throw null;

        PlainDateProperty IJsonModel<PlainDateProperty>.Create(ref Utf8JsonReader reader, ModelReaderWriterOptions options) => throw null;

        protected virtual PlainDateProperty JsonModelCreateCore(ref Utf8JsonReader reader, ModelReaderWriterOptions options) => throw null;

        BinaryData IPersistableModel<PlainDateProperty>.Write(ModelReaderWriterOptions options) => throw null;

        protected virtual BinaryData PersistableModelWriteCore(ModelReaderWriterOptions options) => throw null;

        PlainDateProperty IPersistableModel<PlainDateProperty>.Create(BinaryData data, ModelReaderWriterOptions options) => throw null;

        protected virtual PlainDateProperty PersistableModelCreateCore(BinaryData data, ModelReaderWriterOptions options) => throw null;

        string IPersistableModel<PlainDateProperty>.GetFormatFromOptions(ModelReaderWriterOptions options) => throw null;

        public static implicit operator BinaryContent(PlainDateProperty plainDateProperty) => throw null;

        public static explicit operator PlainDateProperty(ClientResult result) => throw null;
    }
}