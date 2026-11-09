# CartoonCraft — Java Edition

Mod pack para **Minecraft Java Edition** con estética cartoon.

## Contenido

| Módulo | Descripción |
|--------|-------------|
| `CartoonCraft_AnimationsMod` | Mod Fabric que añade animaciones cartoon al jugador |
| `CartoonCraft_BossPetsMod` | Mod Fabric que permite domesticar jefes como mascotas |
| `CartoonCraft_TexturePack` | Resource pack con texturas estilo cartoon |
| `CartoonCraft_Shader` | Shader pack (Optifine/Iris) con look cartoon |

## Requisitos

- Minecraft Java Edition 1.20+
- [Fabric Loader](https://fabricmc.net/)
- [Fabric API](https://modrinth.com/mod/fabric-api)
- Optifine o [Iris Shaders](https://irisshaders.dev/) (para el shader)

## Instalación

1. Instala Fabric Loader para tu versión de Minecraft.
2. Copia los archivos `.jar` de los mods en tu carpeta `mods/`.
3. Copia `CartoonCraft_TexturePack` a tu carpeta `resourcepacks/`.
4. Copia `CartoonCraft_Shader` a tu carpeta `shaderpacks/`.

## Compilar desde fuente

```bash
# AnimationsMod
cd CartoonCraft_AnimationsMod
./gradlew build

# BossPetsMod
cd CartoonCraft_BossPetsMod
./gradlew build
```

Los `.jar` compilados quedan en `build/libs/`.

## Relacionado

- [CartoonCraft Bedrock Edition](https://github.com/Rick0318/CartoonCraft-Bedrock)
- [Archivo histórico (repo original)](https://github.com/Rick0318/CartoonCraft-main)

## Licencia

MIT — libre de usar, modificar y distribuir con atribución.
