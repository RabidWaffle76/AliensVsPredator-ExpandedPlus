package org.avp.client.render.entities.living;

import org.avp.AliensVsPredator;
import org.avp.client.model.entities.living.ModelOvamorph;
import org.avp.entities.living.EntityOvamorph;

import com.arisux.mdx.lib.client.util.OpenGL;
import com.arisux.mdx.lib.client.util.entity.RenderLivingWrapper;

import net.minecraft.client.renderer.entity.RenderManager;

public class RenderOvamorph extends RenderLivingWrapper<EntityOvamorph, ModelOvamorph>
{
    public RenderOvamorph(RenderManager m)
    {
        super(m, AliensVsPredator.resources().models().OVAMORPH);
    }

    @Override
    protected void preRenderCallback(EntityOvamorph ovamorph, float partialTicks)
    {
        super.preRenderCallback(ovamorph, partialTicks);
        OpenGL.scale(1.75F, 1.75F, 1.75F);
    }
}
