import { Image } from "mendix/components/native/Image";

export function MendixImage({ imageToView, imageWidth, imageHeight }) {
    return <Image source={imageToView.value} style={{ width: imageWidth, height: imageHeight }} />;
}
