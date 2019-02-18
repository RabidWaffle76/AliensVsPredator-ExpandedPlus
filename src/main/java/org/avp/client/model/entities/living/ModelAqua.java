package org.avp.client.model.entities.living;

import com.arisux.mdx.lib.client.util.models.Model;

import net.minecraft.client.model.ModelRenderer;

public class ModelAqua extends Model
{
    public ModelRenderer chest, abdomen, rThigh, lThigh, lShinSpike, rShinSpike, lShin2, rShin2, lFootFlipper, rFootFlipper, lArm1, rArm1, lClaw1, rArm2, neck, headBase, headSideHorns, jaw, jaw2, headTopSpikesL, lArm2, rClaw1, lClaw2, rClaw2, spine1, spine2, spine3, tail1, tail2, tail3, tail4, lHead, spine4, tailFin, spine6, spine7, spine8, spine9, spine10, spine11, tail5, spine12, part1, part2, part3, part4, spine5, rHead, rShin1, lShin1, lFoot, rFoot, headTop, headTopSpikes, headTopSpikesR;

    public ModelAqua()
    {
        this.setTextureDimensions(256, 128);

        chest = new ModelRenderer(this, 0, 46);
        chest.addBox(-4.5F, -2F, 0F, 9, 8, 10);
        chest.setRotationPoint(0F, -7.5F, 0F);
        chest.setTextureSize(256, 128);
        chest.mirror = true;
        setRotation(chest, -0.1919862F, 0F, 0F);
        abdomen = new ModelRenderer(this, 0, 27);
        abdomen.addBox(-3.5F, -5F, 8F, 7, 6, 12);
        abdomen.setRotationPoint(0F, -7.5F, 0F);
        abdomen.setTextureSize(256, 128);
        abdomen.mirror = true;
        setRotation(abdomen, -0.5585054F, 0F, 0F);
        rThigh = new ModelRenderer(this, 59, 45);
        rThigh.addBox(-1.5F, -4F, -2.5F, 4, 14, 5);
        rThigh.setRotationPoint(-4.5F, 2F, 16F);
        rThigh.setTextureSize(256, 128);
        rThigh.mirror = true;
        setRotation(rThigh, -0.8028515F, 0.2443461F, 0.418879F);
        lThigh = new ModelRenderer(this, 40, 45);
        lThigh.addBox(-2.5F, -4F, -2.5F, 4, 14, 5);
        lThigh.setRotationPoint(4.5F, 2F, 16F);
        lThigh.setTextureSize(256, 128);
        lThigh.mirror = true;
        setRotation(lThigh, -0.8028515F, -0.2443461F, -0.418879F);
        lShinSpike = new ModelRenderer(this, 125, 9);
        lShinSpike.addBox(-0.5F, 0F, 7F, 0, 6, 4);
        lShinSpike.setRotationPoint(4.5F, 2F, 16F);
        lShinSpike.setTextureSize(256, 128);
        lShinSpike.mirror = true;
        setRotation(lShinSpike, -0.8103905F, -0.2443461F, -0.418879F);
        rShinSpike = new ModelRenderer(this, 134, 9);
        rShinSpike.addBox(0.5F, 0F, 7F, 0, 6, 4);
        rShinSpike.setRotationPoint(-4.5F, 2F, 16F);
        rShinSpike.setTextureSize(256, 128);
        rShinSpike.mirror = true;
        setRotation(rShinSpike, -0.8103905F, 0.2443461F, 0.418879F);
        lShin2 = new ModelRenderer(this, 113, 40);
        lShin2.addBox(-1.5F, 5.5F, 9F, 2, 9, 2);
        lShin2.setRotationPoint(4.5F, 2F, 16F);
        lShin2.setTextureSize(256, 128);
        lShin2.mirror = true;
        setRotation(lShin2, -0.8028515F, -0.2443461F, -0.418879F);
        rShin2 = new ModelRenderer(this, 113, 53);
        rShin2.addBox(-0.5F, 5.5F, 9F, 2, 9, 2);
        rShin2.setRotationPoint(-4.5F, 2F, 16F);
        rShin2.setTextureSize(256, 128);
        rShin2.mirror = true;
        setRotation(rShin2, -0.8028515F, 0.2443461F, 0.418879F);
        lFootFlipper = new ModelRenderer(this, 143, 40);
        lFootFlipper.addBox(2F, 17F, -14F, 8, 0, 11);
        lFootFlipper.setRotationPoint(4.5F, 2F, 17F);
        lFootFlipper.setTextureSize(256, 128);
        lFootFlipper.mirror = true;
        setRotation(lFootFlipper, 0F, -0.2443461F, 0F);
        rFootFlipper = new ModelRenderer(this, 143, 53);
        rFootFlipper.addBox(-10F, 17F, -14F, 8, 0, 11);
        rFootFlipper.setRotationPoint(-4.5F, 2F, 17F);
        rFootFlipper.setTextureSize(256, 128);
        rFootFlipper.mirror = true;
        setRotation(rFootFlipper, 0F, 0.2443461F, 0F);
        lArm1 = new ModelRenderer(this, 40, 29);
        lArm1.addBox(-1F, -1F, -1F, 2, 13, 2);
        lArm1.setRotationPoint(4.5F, -5F, 3F);
        lArm1.setTextureSize(256, 128);
        lArm1.mirror = true;
        setRotation(lArm1, 0.3665191F, 0F, -0.5934119F);
        rArm1 = new ModelRenderer(this, 50, 29);
        rArm1.addBox(-1F, -1F, -1F, 2, 13, 2);
        rArm1.setRotationPoint(-4.5F, -5F, 3F);
        rArm1.setTextureSize(256, 128);
        rArm1.mirror = true;
        setRotation(rArm1, 0.3665191F, 0F, 0.5934119F);
        lClaw1 = new ModelRenderer(this, 83, 24);
        lClaw1.addBox(-1F, 11F, -13.5F, 2, 1, 3);
        lClaw1.setRotationPoint(4.5F, -5F, 3F);
        lClaw1.setTextureSize(256, 128);
        lClaw1.mirror = true;
        setRotation(lClaw1, 0.3665191F, 0F, -0.5934119F);
        rArm2 = new ModelRenderer(this, 98, 9);
        rArm2.addBox(-1F, 10.5F, -10.5F, 2, 2, 11);
        rArm2.setRotationPoint(-4.5F, -5F, 3F);
        rArm2.setTextureSize(256, 128);
        rArm2.mirror = true;
        setRotation(rArm2, 0.3665191F, 0F, 0.5934119F);
        neck = new ModelRenderer(this, 23, 86);
        neck.addBox(-2F, -2F, -4F, 4, 6, 5);
        neck.setRotationPoint(0F, -7.5F, 0F);
        neck.setTextureSize(256, 128);
        neck.mirror = true;
        setRotation(neck, -0.1919862F, 0F, 0F);
        headBase = new ModelRenderer(this, 0, 0);
        headBase.addBox(-2.5F, -5F, -3F, 5, 10, 5);
        headBase.setRotationPoint(0F, -7.5F, -4F);
        headBase.setTextureSize(256, 128);
        headBase.mirror = true;
        setRotation(headBase, -0.6283185F, 0F, 0F);
        headSideHorns = new ModelRenderer(this, 0, 22);
        headSideHorns.addBox(-6.51F, 2F, -4F, 13, 3, 0);
        headSideHorns.setRotationPoint(0F, -7.5F, -4F);
        headSideHorns.setTextureSize(256, 128);
        headSideHorns.mirror = true;
        setRotation(headSideHorns, -0.122173F, 0F, 0F);
        jaw = new ModelRenderer(this, 51, 10);
        jaw.addBox(-2.5F, 2.8F, -5F, 5, 3, 4);
        jaw.setRotationPoint(0F, -7.5F, -4F);
        jaw.setTextureSize(256, 128);
        jaw.mirror = true;
        setRotation(jaw, 0.122173F, 0F, 0F);
        jaw2 = new ModelRenderer(this, 52, 20);
        jaw2.addBox(-1.5F, 4.1F, -6.1F, 3, 2, 5);
        jaw2.setRotationPoint(0F, -7.5F, -4F);
        jaw2.setTextureSize(256, 128);
        jaw2.mirror = true;
        setRotation(jaw2, 0.122173F, 0F, 0F);
        headTopSpikesL = new ModelRenderer(this, 123, 35);
        headTopSpikesL.addBox(0F, -14F, -10.2F, 0, 20, 9);
        headTopSpikesL.setRotationPoint(0F, -7.5F, -4F);
        headTopSpikesL.setTextureSize(256, 128);
        headTopSpikesL.mirror = true;
        setRotation(headTopSpikesL, -0.8552113F, -0.1745329F, 0.3316126F);
        lArm2 = new ModelRenderer(this, 71, 9);
        lArm2.addBox(-1F, 10.5F, -10.5F, 2, 2, 11);
        lArm2.setRotationPoint(4.5F, -5F, 3F);
        lArm2.setTextureSize(256, 128);
        lArm2.mirror = true;
        setRotation(lArm2, 0.3665191F, 0F, -0.5934119F);
        rClaw1 = new ModelRenderer(this, 72, 24);
        rClaw1.addBox(-1F, 11F, -13.5F, 2, 1, 3);
        rClaw1.setRotationPoint(-4.5F, -5F, 3F);
        rClaw1.setTextureSize(256, 128);
        rClaw1.mirror = true;
        setRotation(rClaw1, 0.3665191F, 0F, 0.5934119F);
        lClaw2 = new ModelRenderer(this, 60, 29);
        lClaw2.addBox(-3F, 11.5F, -16.5F, 6, 0, 7);
        lClaw2.setRotationPoint(4.5F, -5F, 3F);
        lClaw2.setTextureSize(256, 128);
        lClaw2.mirror = true;
        setRotation(lClaw2, 0.3665191F, 0F, -0.5934119F);
        rClaw2 = new ModelRenderer(this, 60, 37);
        rClaw2.addBox(-3F, 11.5F, -16.5F, 6, 0, 7);
        rClaw2.setRotationPoint(-4.5F, -5F, 3F);
        rClaw2.setTextureSize(256, 128);
        rClaw2.mirror = true;
        setRotation(rClaw2, 0.3665191F, 0F, 0.5934119F);
        spine1 = new ModelRenderer(this, 0, 65);
        spine1.addBox(0F, -10F, 0F, 0, 8, 10);
        spine1.setRotationPoint(0F, -7.5F, 0F);
        spine1.setTextureSize(256, 128);
        spine1.mirror = true;
        setRotation(spine1, -0.1919862F, 0F, 0F);
        spine2 = new ModelRenderer(this, 23, 65);
        spine2.addBox(0F, -11F, 8F, 0, 6, 12);
        spine2.setRotationPoint(0F, -7.5F, 0F);
        spine2.setTextureSize(256, 128);
        spine2.mirror = true;
        setRotation(spine2, -0.5585054F, 0F, 0F);
        spine3 = new ModelRenderer(this, 50, 83);
        spine3.addBox(-4F, -0.5F, 0F, 8, 0, 11);
        spine3.setRotationPoint(0F, 1.5F, 18.5F);
        spine3.setTextureSize(256, 128);
        spine3.mirror = true;
        setRotation(spine3, -0.4014257F, 0F, 0F);
        tail1 = new ModelRenderer(this, 85, 66);
        tail1.addBox(-2F, -1.5F, 11F, 4, 4, 11);
        tail1.setRotationPoint(0F, 1.5F, 18.5F);
        tail1.setTextureSize(256, 128);
        tail1.mirror = true;
        setRotation(tail1, -0.3141593F, 0F, 0F);
        tail2 = new ModelRenderer(this, 118, 66);
        tail2.addBox(-1.5F, 1.5F, 21F, 3, 3, 11);
        tail2.setRotationPoint(0F, 1.5F, 18.5F);
        tail2.setTextureSize(256, 128);
        tail2.mirror = true;
        setRotation(tail2, -0.2094395F, 0F, 0F);
        tail3 = new ModelRenderer(this, 149, 66);
        tail3.addBox(-1F, 4F, 31F, 2, 2, 11);
        tail3.setRotationPoint(0F, 1.5F, 18.5F);
        tail3.setTextureSize(256, 128);
        tail3.mirror = true;
        setRotation(tail3, -0.1396263F, 0F, 0F);
        tail4 = new ModelRenderer(this, 178, 66);
        tail4.addBox(-0.5F, 8.5F, 41F, 1, 1, 11);
        tail4.setRotationPoint(0F, 1.5F, 18.5F);
        tail4.setTextureSize(256, 128);
        tail4.mirror = true;
        setRotation(tail4, -0.0523599F, 0F, 0F);
        lHead = new ModelRenderer(this, 53, 0);
        lHead.addBox(-0.499F, 3F, -5F, 3, 3, 5);
        lHead.setRotationPoint(0F, -7.5F, -4F);
        lHead.setTextureSize(256, 128);
        lHead.mirror = true;
        setRotation(lHead, -0.122173F, 0F, 0F);
        spine4 = new ModelRenderer(this, 153, 83);
        spine4.addBox(-1.5F, 9F, 41F, 3, 0, 11);
        spine4.setRotationPoint(0F, 1.5F, 18.5F);
        spine4.setTextureSize(256, 128);
        spine4.mirror = true;
        setRotation(spine4, -0.0523599F, 0F, 0F);
        tailFin = new ModelRenderer(this, 202, 96);
        tailFin.addBox(0F, 2.5F, 52F, 0, 12, 11);
        tailFin.setRotationPoint(0F, 1.5F, 18.5F);
        tailFin.setTextureSize(256, 128);
        tailFin.mirror = true;
        setRotation(tailFin, -0.0523599F, 0F, 0F);
        spine6 = new ModelRenderer(this, 148, 96);
        spine6.addBox(0F, 0F, 32F, 0, 8, 10);
        spine6.setRotationPoint(0F, 1.5F, 18.5F);
        spine6.setTextureSize(256, 128);
        spine6.mirror = true;
        setRotation(spine6, -0.1396263F, 0F, 0F);
        spine7 = new ModelRenderer(this, 135, 83);
        spine7.addBox(-2F, 5F, 32F, 4, 0, 10);
        spine7.setRotationPoint(0F, 1.5F, 18.5F);
        spine7.setTextureSize(256, 128);
        spine7.mirror = true;
        setRotation(spine7, -0.1396263F, 0F, 0F);
        spine8 = new ModelRenderer(this, 113, 83);
        spine8.addBox(-3F, 3F, 22F, 6, 0, 10);
        spine8.setRotationPoint(0F, 1.5F, 18.5F);
        spine8.setTextureSize(256, 128);
        spine8.mirror = true;
        setRotation(spine8, -0.2094395F, 0F, 0F);
        spine9 = new ModelRenderer(this, 117, 94);
        spine9.addBox(0F, -1F, 22F, 0, 7, 10);
        spine9.setRotationPoint(0F, 1.5F, 18.5F);
        spine9.setTextureSize(256, 128);
        spine9.mirror = true;
        setRotation(spine9, -0.2094395F, 0F, 0F);
        spine10 = new ModelRenderer(this, 85, 83);
        spine10.addBox(-4F, 0.5F, 11F, 8, 0, 11);
        spine10.setRotationPoint(0F, 1.5F, 18.5F);
        spine10.setTextureSize(256, 128);
        spine10.mirror = true;
        setRotation(spine10, -0.3141593F, 0F, 0F);
        spine11 = new ModelRenderer(this, 90, 93);
        spine11.addBox(0F, -3.5F, 11F, 0, 8, 11);
        spine11.setRotationPoint(0F, 1.5F, 18.5F);
        spine11.setTextureSize(256, 128);
        spine11.mirror = true;
        setRotation(spine11, -0.3141593F, 0F, 0F);
        tail5 = new ModelRenderer(this, 50, 66);
        tail5.addBox(-2F, -2.5F, 0F, 4, 4, 11);
        tail5.setRotationPoint(0F, 1.5F, 18.5F);
        tail5.setTextureSize(256, 128);
        tail5.mirror = true;
        setRotation(tail5, -0.4014257F, 0F, 0F);
        spine12 = new ModelRenderer(this, 58, 93);
        spine12.addBox(0F, -4.5F, 0F, 0, 8, 11);
        spine12.setRotationPoint(0F, 1.5F, 18.5F);
        spine12.setTextureSize(256, 128);
        spine12.mirror = true;
        setRotation(spine12, -0.4014257F, 0F, 0F);
        part1 = new ModelRenderer(this, 10, 86);
        part1.addBox(-4.5F, -11F, 7F, 2, 9, 2);
        part1.setRotationPoint(0F, -7.5F, 0F);
        part1.setTextureSize(256, 128);
        part1.mirror = true;
        setRotation(part1, -0.1919862F, 0F, -0.1745329F);
        part2 = new ModelRenderer(this, 0, 86);
        part2.addBox(2.5F, -11F, 7F, 2, 9, 2);
        part2.setRotationPoint(0F, -7.5F, 0F);
        part2.setTextureSize(256, 128);
        part2.mirror = true;
        setRotation(part2, -0.1919862F, 0F, 0.1745329F);
        part3 = new ModelRenderer(this, 9, 86);
        part3.addBox(-3.5F, -13F, 10F, 2, 8, 2);
        part3.setRotationPoint(0F, -7.5F, 0F);
        part3.setTextureSize(256, 128);
        part3.mirror = true;
        setRotation(part3, -0.5585054F, 0F, -0.1745329F);
        part4 = new ModelRenderer(this, 0, 86);
        part4.addBox(1.5F, -13F, 10F, 2, 8, 2);
        part4.setRotationPoint(0F, -7.5F, 0F);
        part4.setTextureSize(256, 128);
        part4.mirror = true;
        setRotation(part4, -0.5585054F, 0F, 0.1745329F);
        spine5 = new ModelRenderer(this, 178, 96);
        spine5.addBox(0F, 3.5F, 41F, 0, 8, 11);
        spine5.setRotationPoint(0F, 1.5F, 18.5F);
        spine5.setTextureSize(256, 128);
        spine5.mirror = true;
        setRotation(spine5, -0.0523599F, 0F, 0F);
        rHead = new ModelRenderer(this, 34, 0);
        rHead.addBox(-2.51F, 3F, -5F, 3, 3, 5);
        rHead.setRotationPoint(0F, -7.5F, -4F);
        rHead.setTextureSize(256, 128);
        rHead.mirror = true;
        setRotation(rHead, -0.122173F, 0F, 0F);
        rShin1 = new ModelRenderer(this, 79, 33);
        rShin1.addBox(-1F, 8F, -5.5F, 3, 3, 12);
        rShin1.setRotationPoint(-4.5F, 2F, 16F);
        rShin1.setTextureSize(256, 128);
        rShin1.mirror = true;
        setRotation(rShin1, -0.4014257F, 0.2443461F, 0.418879F);
        lShin1 = new ModelRenderer(this, 79, 49);
        lShin1.addBox(-2F, 8F, -5.5F, 3, 3, 12);
        lShin1.setRotationPoint(4.5F, 2F, 16F);
        lShin1.setTextureSize(256, 128);
        lShin1.mirror = true;
        setRotation(lShin1, -0.4014257F, -0.2443461F, -0.418879F);
        headTop = new ModelRenderer(this, 28, 10);
        headTop.addBox(-2.5F, -14F, -4.2F, 5, 10, 5);
        headTop.setRotationPoint(0F, -7.5F, -4F);
        headTop.setTextureSize(256, 128);
        headTop.mirror = true;
        setRotation(headTop, -0.9075712F, 0F, 0F);
        lFoot = new ModelRenderer(this, 110, 24);
        lFoot.addBox(5F, 16F, -8F, 2, 1, 5);
        lFoot.setRotationPoint(4.5F, 2F, 17F);
        lFoot.setTextureSize(256, 128);
        lFoot.mirror = true;
        setRotation(lFoot, 0F, -0.2443461F, 0F);
        rFoot = new ModelRenderer(this, 95, 24);
        rFoot.addBox(-7F, 16F, -8F, 2, 1, 5);
        rFoot.setRotationPoint(-4.5F, 2F, 17F);
        rFoot.setTextureSize(256, 128);
        rFoot.mirror = true;
        setRotation(rFoot, 0F, 0.2443461F, 0F);
        headTopSpikes = new ModelRenderer(this, 123, 35);
        headTopSpikes.addBox(0F, -14F, -10.2F, 0, 20, 9);
        headTopSpikes.setRotationPoint(0F, -7.5F, -4F);
        headTopSpikes.setTextureSize(256, 128);
        headTopSpikes.mirror = true;
        setRotation(headTopSpikes, -0.8552113F, 0F, 0F);
        headTopSpikesR = new ModelRenderer(this, 123, 35);
        headTopSpikesR.addBox(0F, -14F, -10.2F, 0, 20, 9);
        headTopSpikesR.setRotationPoint(0F, -7.5F, -4F);
        headTopSpikesR.setTextureSize(256, 128);
        headTopSpikesR.mirror = true;
        setRotation(headTopSpikesR, -0.8552113F, 0.2617994F, -0.3490659F);
    }

    @Override
    public void render(Object obj)
    {
        draw(chest);
        draw(abdomen);
        draw(rThigh);
        draw(lThigh);
        draw(lShinSpike);
        draw(rShinSpike);
        draw(lShin2);
        draw(rShin2);
        draw(lFootFlipper);
        draw(rFootFlipper);
        draw(lArm1);
        draw(rArm1);
        draw(lClaw1);
        draw(rArm2);
        draw(neck);
        draw(headBase);
        draw(headSideHorns);
        draw(jaw);
        draw(jaw2);
        draw(headTopSpikesL);
        draw(lArm2);
        draw(rClaw1);
        draw(lClaw2);
        draw(rClaw2);
        draw(spine1);
        draw(spine2);
        draw(spine3);
        draw(tail1);
        draw(tail2);
        draw(tail3);
        draw(tail4);
        draw(lHead);
        draw(spine4);
        draw(tailFin);
        draw(spine6);
        draw(spine7);
        draw(spine8);
        draw(spine9);
        draw(spine10);
        draw(spine11);
        draw(tail5);
        draw(spine12);
        draw(part1);
        draw(part2);
        draw(part3);
        draw(part4);
        draw(spine5);
        draw(rHead);
        draw(rShin1);
        draw(lShin1);
        draw(headTop);
        draw(lFoot);
        draw(rFoot);
        draw(headTopSpikes);
        draw(headTopSpikesR);
    }
}
