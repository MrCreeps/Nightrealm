// Made with Blockbench 4.3.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelblob extends EntityModel<Entity> {
	private final ModelRenderer R;
	private final ModelRenderer L;
	private final ModelRenderer bb_main;

	public Modelblob() {
		textureWidth = 64;
		textureHeight = 64;

		R = new ModelRenderer(this);
		R.setRotationPoint(4.0F, 19.0F, 0.0F);
		R.setTextureOffset(0, 28).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		L = new ModelRenderer(this);
		L.setRotationPoint(-4.0F, 19.0F, 0.0F);
		L.setTextureOffset(0, 28).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-7.0F, -19.0F, -7.0F, 14.0F, 14.0F, 14.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		R.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		L.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.R.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.L.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}