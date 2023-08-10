# Entity Metadata
| Packet ID | Direction |
| --- | --- |
| `0x28` | Clientbound |

This packet is used by the server to change an entity's state on the client.

## Clientbound
| Field | Type | Description |
| --- | --- | --- |
| Entity ID | Integer | The entity ID to change metadata. |
| Entity Metadata | | Refer to [Entity Metadata](../entity_metadata.md#format). |

<details>
    <summary>Example Packet</summary>

| Field | Value | 
| --- | --- |
| Entity ID | 1463 |
| Field | 16 |
| Value | 1 |
| Field | 17 |
| Value | "Notch" |
| Field | 18 |
| Value | 20 |
| Terminator | 127 |
</details>