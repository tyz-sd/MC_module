package com.tutorial.boson.lbmzxhb;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;


public class BurgerBlock extends Block {
    private static IntegerProperty STATE = IntegerProperty.create("face", 0, 1);
    public BurgerBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(1));
    }
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(STATE);
        super.fillStateContainer(builder);
    }
}