# Login
| Packet ID | Direction |
| --- | --- |
| `0x00` | Both |

This packet is sent by the client after the connection is opened, and by the server after the client has sent their packet.

## Clientbound
| Field | Type | Description |
| --- | --- | --- |
| Protocol Version | Byte | The version of the protocol. Always `0x07`. |
| Username | String | The name of the player trying to join. |
| Key | String | The key used to authenticate with the server list. |
| Unused | Byte | Useful for mod handshaking. |

<details>
    <summary>Example Packet</summary>

| Field | Value | 
| --- | --- |
| Protocol Version | 0x07 |
| Username | "Notch" |
| Key | |
| Unused | 0x00 |
</details>

## Serverbound
| Field | Type | Description |
| --- | --- | --- |
| Protocol Version | Byte | The version of the protocol. Always `0x07`. |
| Name | String | The name of the server. |
| MOTD | String | The message of the day of the server. |
| User Status | Byte | `0x64` if the player is an operator and can place flowing liquids. |

<details>
    <summary>Example Packet</summary>

| Field | Value | 
| --- | --- |
| Protocol Version | 0x07 |
| Name | "A Minecraft Server" |
| MOTD | "Welcome to my server!" |
| User Status | 0x00 |
</details>