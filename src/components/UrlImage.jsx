import { Image } from "react-native";

export function UrlImage({ uri, imageWidth, imageHeight }) {
    return <Image source={{ uri }} resizeMode="contain" style={{ width: imageWidth, height: imageHeight }} />;
}
