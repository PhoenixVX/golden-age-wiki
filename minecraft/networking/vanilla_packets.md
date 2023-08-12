# Vanilla Packets
## Classic
- [LOGIN](classic/login.md)
- [LEVEL_INITIALIZE](classic/level_initialize.md)
- [LEVEL_DATA_CHUNK](classic/level_data_chunk.md)
- [LEVEL_FINALIZE](classic/level_finalize.md)
- [PLACE_OR_REMOVE_TILE](classic/place_or_remove_tile.md)
- [SET_TILE](classic/set_tile.md)
- [PLAYER_JOIN](classic/player_join.md)
- [PLAYER_TELEPORT](classic/player_teleport.md)
- [PLAYER_MOVE_AND_ROTATE](classic/player_move_and_rotate.md)
- [PLAYER_MOVE](classic/player_move.md)
- [PLAYER_ROTATE](classic/player_rotate.md)
- [PLAYER_DISCONNECT](classic/player_disconnect.md)
- [CHAT_MESSAGE](classic/chat_message.md)
- [KICK_PLAYER](classic/kick_player.md)
- [USER_TYPE](classic/user_type.md)

## Alpha
<details>
<summary>Collapsible section</summary>

| Packet ID | Packet |
| --------- | ------ |
| `0x00` | [KEEP_ALIVE](alpha/000-keep-alive.md) |
| `0x01` | [LOGIN](alpha/001-login.md) |
| `0x02` | [HANDSHAKE](alpha/002-handshake.md) |
| `0x03` | [CHAT](alpha/003-chat.md) |
| `0x04` | [TIME](alpha/004-time.md) |
| `0x05` | [ENTITY_INVENTORY](alpha/005-entity-inventory.md) |
| `0x06` | [SPAWN_POINT](alpha/006-spawn-point.md) |
| `0x07` | [CLICK_ENTITY](alpha/007-click-entity.md) |
| `0x08` | [HEALTH](alpha/008-health.md) |
| `0x09` | [RESPAWN](alpha/009-respawn.md) |
| `0x10` | [PLAYER_ON_GROUND](alpha/010-player-on-ground.md) |
| `0x11` | [PLAYER_POSITION](alpha/011-player-position.md) |
| `0x12` | [PLAYER_LOOK](alpha/012-player-look.md) |
| `0x13` | [PLAYER_POSITION_LOOK](alpha/013-player-position-look.md) |
| `0x14` | [MINE](alpha/014-mine.md) |
| `0x15` | [PLACE](alpha/015-place.md) |
| `0x16` | [HELD_ITEM](alpha/016-held-item.md) |
| `0x17` | [ADD_TO_INVENTORY](alpha/017-add-to-inventory.md) |
| `0x18` | [ANIMATION](alpha/018-animation.md) |
| `0x20` | [SPAWN_PLAYER](alpha/020-spawn-player.md) |
| `0x21` | [SPAWN_ITEM](alpha/021-spawn-item.md) |
| `0x22` | [COLLECT_ITEM](alpha/022-collect-item.md) |
| `0x23` | [SPAWN_OBJECT](alpha/023-spawn-object.md) |
| `0x24` | [SPAWN_MOB](alpha/024-spawn-mob.md) |
| `0x28` | [ENTITY_VELOCITY](alpha/028-entity-velocity.md) |
| `0x29` | [DESPAWN_ENTITY](alpha/029-despawn-entity.md) |
| `0x30` | [ENTITY](alpha/030-entity.md) |
| `0x31` | [ENTITY_RELATIVE_POSITION](alpha/031-entity-relative-position.md) |
| `0x32` | [ENTITY_LOOK](alpha/032-entity-look.md) |
| `0x33` | [ENTITY_RELATIVE_POSITION_LOOK](alpha/033-entity-relative-position-look.md) |
| `0x34` | [ENTITY_TELEPORT](alpha/034-entity-teleport.md) |
| `0x38` | [ENTITY_STATUS](alpha/038-entity-status.md) |
| `0x39` | [MOUNT_ENTITY](alpha/039-mount-entity.md) |
| `0x50` | [PRE_CHUNK](alpha/050-pre-chunk.md) |
| `0x51` | [CHUNK](alpha/051-chunk.md) |
| `0x52` | [SET_MULTIPLE_BLOCKS](alpha/052-set-multiple-blocks.md) |
| `0x53` | [SET_BLOCK](alpha/053-set-block.md) |
| `0x59` | [COMPLEX_ENTITY](alpha/059-complex-entity.md) |
| `0x60` | [EXPLOSION](alpha/060-explosion.md) |
| `0x255` | [DISCONNECT](alpha/255-disconnect.md) |
</details>

## Beta
<details>
<summary>Collapsible section</summary>

| Packet ID | Packet |
| --- | --- |
| `0x28` | [ENTITY_METADATA](beta/040-entity-metadata.md) |
</details>

## Release
<details>
<summary>Collapsible section</summary>

| Packet ID | Packet |
| --------- | ------ |
| `0x00` | [KEEP_ALIVE](release/000-alive.md) |
| `0x01` | [LOGIN](release/001-login.md) |
| `0x02` | [CLIENT_PROTOCOL](release/002-client-protocol.md) |
| `0x03` | [CHAT](release/003-chat.md) |
| `0x04` | [TIME](release/004-time.md) |
| `0x05` | [PLAYER_INVENTORY](release/005-player-inventory.md) |
| `0x06` | [SPAWN_POINT](release/006-spawn-point.md) |
| `0x07` | [CLICK_ENTITY](release/007-click-entity.md) |
| `0x08` | [HEALTH](release/008-health.md) |
| `0x09` | [RESPAWN](release/009-respawn.md) |
| `0x10` | [FLYING](release/010-flying.md) |
| `0x11` | [PLAYER_POSITION](release/011-player-position.md) |
| `0x12` | [PLAYER_LOOK](release/012-player-look.md) |
| `0x13` | [PLAYER_LOOK_MOVE](release/013-player-look-move.md) |
| `0x14` | [DIG](release/014-dig.md) |
| `0x15` | [PLACE](release/015-place.md) |
| `0x16` | [HELD_ITEM](release/016-held-item.md) |
| `0x17` | [SLEEP](release/017-sleep.md) |
| `0x18` | [ANIMATION](release/018-animation.md) |
| `0x19` | [ENTITY_ACTION](release/019-entity-action.md) |
| `0x20` | [SPAWN_PLAYER](release/020-spawn-player.md) |
| `0x22` | [COLLECT](release/022-collect.md) |
| `0x23` | [SPAWN_VEHICLE](release/023-spawn-vehicle.md) |
| `0x24` | [SPAWN_MOB](release/024-spawn-mob.md) |
| `0x25` | [PAINTING_ENTITY](release/025-painting-entity.md) |
| `0x26` | [EXP_ORB_ENTITY](release/026-exp-orb-entity.md) |
| `0x28` | [VELOCITY](release/028-velocity.md) |
| `0x29` | [DESTROY_ENTITY](release/029-destroy-entity.md) |
| `0x30` | [ENTITY](release/030-entity.md) |
| `0x31` | [RELATIVE_ENTITY_MOVE](release/031-relative-entity-move.md) |
| `0x32` | [ENTITY_LOOK](release/032-entity-look.md) |
| `0x33` | [RELATIVE_ENTITY_MOVE_LOOK](release/033-relative-entity-move-look.md) |
| `0x34` | [ENTITY_TELEPORT](release/034-entity-teleport.md) |
| `0x35` | [ENTITY_HEAD_ROTATION](release/035-entity-head-rotation.md) |
| `0x38` | [ENTITY_STATUS](release/038-entity-status.md) |
| `0x39` | [ATTACH_ENTITY](release/039-attach-entity.md) |
| `0x40` | [ENTITY_METADATA](release/040-entity-metadata.md) |
| `0x41` | [ENTITY_EFFECT](release/041-entity-effect.md) |
| `0x42` | [REMOVE_ENTITY_EFFECT](release/042-remove-entity-effect.md) |
| `0x43` | [EXPERIENCE](release/043-experience.md) |
| `0x51` | [MAP_CHUNK](release/051-map-chunk.md) |
| `0x52` | [MULTI_BLOCK_CHANGE](release/052-multi-block-change.md) |
| `0x53` | [BLOCK_CHANGE](release/053-block-change.md) |
| `0x54` | [PLAY_NOTE_BLOCK](release/054-play-note-block.md) |
| `0x55` | [BLOCK_DESTROY](release/055-block-destroy.md) |
| `0x56` | [MAP_CHUNKS](release/056-map-chunks.md) |
| `0x60` | [EXPLOSION](release/060-explosion.md) |
| `0x61` | [DOOR_CHANGE](release/061-door-change.md) |
| `0x62` | [LEVEL_SOUND](release/062-level-sound.md) |
| `0x63` | [WORLD_PARTICLES](release/063-world-particles.md) |
| `0x70` | [GAME_EVENT](release/070-game-event.md) |
| `0x71` | [WEATHER](release/071-weather.md) |
| `0x100` | [OPEN_WINDOW](release/100-open-window.md) |
| `0x101` | [CLOSE_WINDOW](release/101-close-window.md) |
| `0x102` | [CLICK_WINDOW](release/102-window-click.md) |
| `0x103` | [SET_SLOT](release/103-set-slot.md) |
| `0x104` | [WINDOW_ITEMS](release/104-window-items.md) |
| `0x105` | [UPDATE_PROGRESS](release/105-update-progressbar.md) |
| `0x106` | [TRANSACTION](release/106-transaction.md) |
| `0x107` | [CREATIVE_SET_SLOT](release/107-creative-set-slot.md) |
| `0x108` | [ENCHANT_ITEM](release/108-enchant-item.md) |
| `0x130` | [UPDATE_SIGN](release/130-update-sign.md) |
| `0x131` | [MAP_DATA](release/131-map-data.md) |
| `0x132` | [TILE_ENTITY_DATA](release/132-tile-entity-data.md) |
| `0x200` | [STATISTIC](release/200-statistic.md) |
| `0x201` | [PLAYER_INFO](release/201-player-info.md) |
| `0x202` | [PLAYER_ABILITIES](release/202-player-abilities.md) |
| `0x203` | [AUTO_COMPLETE](release/203-auto-complete.md) |
| `0x204` | [CLIENT_INFO](release/204-client-info.md) |
| `0x205` | [CLIENT_COMMAND](release/205-client-command.md) |
| `0x206` | [SET_OBJECTIVE](release/206-set-objective.md) |
| `0x207` | [SET_SCORE](release/207-set-score.md) |
| `0x208` | [SET_DISPLAY_OBJECTIVE](release/208-set-display-objective.md) |
| `0x209` | [SET_PLAYER_TEAM](release/209-set-player-team.md) |
| `0x250` | [CUSTOM_PAYLOAD](release/250-custom-payload.md) |
| `0x252` | [SHARED_KEY](release/252-shared-key.md) |
| `0x253` | [SERVER_AUTH_DATA](release/253-server-auth-data.md) |
| `0x254` | [SERVER_PING](release/254-server-ping.md) |
| `0x255` | [DISCONNECT](release/255-disconnect.md)
</details>