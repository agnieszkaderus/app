import React from "react";
import "./PhotoMain.css";

const PhotoMain = ({photo}) => {

    return(

<div className='div1'>
    <div className='div2' style={{backgroundImage: `url(${photo.image})`}}  >

    </div>
    <div>
        <div className='div3'></div>
        <div className="div4">
            <div className="div5">
                <div className='div6 '>
                    {/*<img className="imageFlag"  src={photo.image}/>*/}
                    <h1 className='h1-div6'> {photo.title} </h1>
                    <h2 className='h2-div6'> {photo.title} </h2>
                    <button className='photo-button'> IDZ TAM  </button>
                </div>
            </div>
        </div>
    </div>
</div>

    )}

export default PhotoMain;
