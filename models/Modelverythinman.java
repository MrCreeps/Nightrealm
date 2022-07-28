// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelverythinman extends EntityModel<Entity> {
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer bb_main;

	public Modelverythinman() {
		textureWidth = 32;
		textureHeight = 32;

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-0.5F, 2.0F, 0.5F);
		leg1.setTextureOffset(16, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(3.5F, 2.0F, 0.5F);
		leg2.setTextureOffset(12, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-1.0F, -44.0F, 0.0F, 5.0F, 22.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leg1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}