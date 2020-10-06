package net.minecraft.world.storage;

import net.minecraft.util.math.BlockPos;

public interface ISpawnWorldInfo extends IWorldInfo {
   void setSpawnX(int x);

   void setSpawnY(int y);

   void setSpawnZ(int z);

   void func_241859_a(float p_241859_1_);

   default void setSpawn(BlockPos spawnPoint, float p_176143_2_) {
      this.setSpawnX(spawnPoint.getX());
      this.setSpawnY(spawnPoint.getY());
      this.setSpawnZ(spawnPoint.getZ());
      this.func_241859_a(p_176143_2_);
   }
}