
package mrcreeps.mods.nightrealm.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import mrcreeps.mods.nightrealm.entity.WealdhoundEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WealdhoundRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WealdhoundEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwealdhound(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("nightrealm:textures/wealdhound.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelwealdhound extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer upperBody;
		private final ModelRenderer leg0;
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg3;
		private final ModelRenderer tail;

		public Modelwealdhound() {
			textureWidth = 64;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(-1.0F, 15.5F, -7.0F);
			head.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(16, 14).addBox(-3.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 14).addBox(1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 10).addBox(-1.5F, -0.0156F, -4.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 14.0F, 2.0F);
			setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
			body.setTextureOffset(18, 14).addBox(-4.0F, -2.0F, -5.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);
			upperBody = new ModelRenderer(this);
			upperBody.setRotationPoint(-1.0F, 14.0F, 2.0F);
			setRotationAngle(upperBody, -1.5708F, 0.0F, 0.0F);
			upperBody.setTextureOffset(21, 0).addBox(-4.0F, 2.0F, -2.0F, 8.0F, 6.0F, 7.0F, 0.0F, false);
			leg0 = new ModelRenderer(this);
			leg0.setRotationPoint(-2.5F, 16.0F, 7.0F);
			leg0.setTextureOffset(0, 18).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(0.5F, 16.0F, 7.0F);
			leg1.setTextureOffset(0, 18).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(-2.5F, 16.0F, -4.0F);
			leg2.setTextureOffset(0, 18).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(0.5F, 16.0F, -4.0F);
			leg3.setTextureOffset(0, 18).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(-1.0F, 12.0F, 8.0F);
			setRotationAngle(tail, 0.9599F, 0.0F, 0.0F);
			tail.setTextureOffset(9, 18).addBox(-1.0F, 0.0F, -3.8F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			upperBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			leg0.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			leg1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			leg2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			leg3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			tail.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
