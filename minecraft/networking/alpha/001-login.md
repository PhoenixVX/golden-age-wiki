# Login
| Packet ID | Direction |
| --- | --- |
| `0x01` | Both |

This packet is sent after [Handshake](002-handshake.md) to finish logging in. The server is expected to kick the client if any fields are invalid or the client's protocol version does not match the server. The unused fields are also useful for negotiating mod support.

## Clientbound
| Field | Type | Description |
| ----- | ---- | ----------- |
