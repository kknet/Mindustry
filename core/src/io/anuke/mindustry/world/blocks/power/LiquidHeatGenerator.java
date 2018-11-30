package io.anuke.mindustry.world.blocks.power;

import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.type.Liquid;
import io.anuke.mindustry.world.meta.BlockStat;
import io.anuke.mindustry.world.meta.StatUnit;

public class LiquidHeatGenerator extends ItemLiquidGenerator{

    public LiquidHeatGenerator(String name){
        super(InputType.LiquidsOnly, name);
    }

    @Override
    public void setStats(){
        super.setStats();

        stats.remove(BlockStat.basePowerGeneration);
        // TODO Adapt to new new power system. Maybe this override can be removed.
        //stats.add(BlockStat.basePowerGeneration, <Do something with maxLiquidGenerate, basePowerGeneration and liquidPowerMultiplier> * 60f, StatUnit.powerSecond);
    }

    @Override
    protected float getLiquidEfficiency(Liquid liquid){
        return liquid.temperature - 0.5f;
    }
}
