// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelnightslitherer extends EntityModel<Entity> {
	private final ModelRenderer frontseg;
	private final ModelRenderer frontseg2;
	private final ModelRenderer backseg;
	private final ModelRenderer backseg2;
	private final ModelRenderer bb_main;

	public Modelnightslitherer() {
		textureWidth = 64;
		textureHeight = 64;

		frontseg = new ModelRenderer(this);
		frontseg.setRotationPoint(0.0F, 24.0F, -16.0F);
		frontseg.setTextureOffset(0, 33).addBox(-1.5F, -3.0F, -8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		frontseg2 = new ModelRenderer(this);
		frontseg2.setRotationPoint(0.0F, 24.0F, -8.0F);
		frontseg2.setTextureOffset(0, 21).addBox(-2.0F, -4.0F, -8.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

		backseg = new ModelRenderer(this);
		backseg.setRotationPoint(0.0F, 24.0F, 16.0F);
		backseg.setTextureOffset(28, 0).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		backseg2 = new ModelRenderer(this);
		backseg2.setRotationPoint(0.0F, 24.0F, 8.0F);
		backseg2.setTextureOffset(24, 21).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-3.0F, -5.0F, -8.0F, 6.0F, 5.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		frontseg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		frontseg2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		backseg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		backseg2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.frontseg.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.backseg.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.frontseg2.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.backseg2.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}