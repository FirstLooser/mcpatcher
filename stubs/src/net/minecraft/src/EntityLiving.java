package net.minecraft.src;

import com.pclewis.mcpatcher.mod.MobRandomizer;

public class EntityLiving extends Entity {
    protected int health;

    public EntityLiving(World worldObj) {
        super(worldObj);
    }

    @Override
    protected void entityInit() {
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound var1) {
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound var1) {
    }
}
