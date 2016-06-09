package the_fireplace.frt.renderers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import the_fireplace.frt.entity.projectile.EntityBazookaAmmo;

/**
 * @author The_Fireplace
 */
public class AmmoRenderFactory implements IRenderFactory<EntityBazookaAmmo> {

    private Item ammo;
    private ResourceLocation location;

    public AmmoRenderFactory(Item item){
        ammo=item;
    }

    public AmmoRenderFactory(Item item, ResourceLocation loc){
        ammo=item;
        location=loc;
    }

    @Override
    public Render<? super EntityBazookaAmmo> createRenderFor(RenderManager manager) {
        if(location != null)
            return new RenderAmmo(manager, ammo, location);
        else
            return new RenderAmmo(manager, ammo);
    }
}
